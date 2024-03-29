package com.example.demo.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.model.CustomerModel;
import com.example.demo.service.CustomerService;
/**
* This class provides a rest API for the customer.
*/
@RestController
public class CustomerController {

    private final static Logger log = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private CustomerService customerService;


    @Autowired
    private CustomerModelAssembler customerModelAssembler;

    @Autowired
    private PagedResourcesAssembler<Customer> pagedResourcesAssembler;

    /**
     * Rest API for retreiving a single customer.
     * @param id The primary key of the customer in the database.
     * @return The customer in json format.
     * @throws Exception If the customer can't be found.
     */
    @GetMapping("/api/v1/customer/{id}")
    public EntityModel<Customer> retrieveCustomer(@PathVariable long id) throws Exception {
        Customer employee = customerService.getCustomer(id);

        if (employee == null) {
            throw new Exception("No id-" + id);
        }
            
        return EntityModel.of(employee, 
          linkTo(methodOn(CustomerController.class).retrieveCustomer(id)).withSelfRel(),
          linkTo(methodOn(CustomerController.class).fetchCustomersWithPageInterface("", "", 0, 5)).withRel("customers"));
    }

    /**
     * Deletes the customer from the db.
     * @param id The customer_id of the customer that will be deleted.
     * @throws Exception If the customer can be found or deleted.
     */
    @RequestMapping(value = "/api/v1/customer/{id}", method = RequestMethod.DELETE)
    public void deleteLocation(@PathVariable String id) throws Exception {
        customerService.deleteCustomer(Long.valueOf(id));
    }

    /**
     * Rest api for returning all the customers in the database.
     * @return All the customers in json format.
     */
    @GetMapping("/api/v0/customer")
    public CollectionModel<EntityModel<Customer>> retrieveAllEmployees() {
        List<EntityModel<Customer>> items = customerService.fetchCustomerDataAsList().stream().map(item -> EntityModel.of(item,
                linkTo(methodOn(CustomerController.class).retrieveAllEmployees()).withRel("customers")))
                .collect(Collectors.toList());
        for(EntityModel<Customer> em : items) {
            Customer customer = em.getContent();
            try {
                em.add(linkTo(methodOn(CustomerController.class).retrieveCustomer(customer.getId())).withSelfRel());
            } catch (Exception e) {
                log.error(e.getMessage());
            }
        }
        return CollectionModel.of(items, linkTo(methodOn(CustomerController.class).retrieveAllEmployees()).withSelfRel());
    }
    
    /**
     * @param firstNameFilter Filter for the first Name if required
     * @param lastNameFilter  Filter for the last Name if required
     * @return List of filtered customers
     */
    @GetMapping("/api/v1/customer")
    public List<Customer> fetchCustomersAsFilteredList(@RequestParam(defaultValue = "") String firstNameFilter,
                                                       @RequestParam(defaultValue = "") String lastNameFilter) {
        return customerService.fetchFilteredCustomerDataAsList(firstNameFilter, lastNameFilter);
    }

    /**
     * @param firstNameFilter Filter for the first Name if required
     * @param lastNameFilter  Filter for the last Name if required
     * @param page            number of the page returned
     * @param size            number of entries in each page
     * @return Page object with customers after filtering
     */
    @GetMapping("/api/v2/customer")
    public Page<Customer> fetchCustomersWithPageInterface(@RequestParam(defaultValue = "") String firstNameFilter,
                                                          @RequestParam(defaultValue = "") String lastNameFilter,
                                                          @RequestParam(defaultValue = "0") int page,
                                                          @RequestParam(defaultValue = "30") int size) {
        return customerService.fetchCustomerDataAsPageWithFiltering(firstNameFilter, lastNameFilter, page, size);
    }

    /**
     * @param firstNameFilter Filter for the first Name if required
     * @param lastNameFilter  Filter for the last Name if required
     * @param page            number of the page returned
     * @param size            number of entries in each page
     * @param sortList        list of columns to sort on
     * @param sortOrder       sort order. Can be ASC or DESC
     * @return Page object with customers after filtering and sorting
     */
    @GetMapping("/api/v3/customer")
    public Page<Customer> fetchCustomersWithPageInterfaceAndSorted(@RequestParam(defaultValue = "") String firstNameFilter,
                                                                   @RequestParam(defaultValue = "") String lastNameFilter,
                                                                   @RequestParam(defaultValue = "0") int page,
                                                                   @RequestParam(defaultValue = "30") int size,
                                                                   @RequestParam(defaultValue = "") List<String> sortList,
                                                                   @RequestParam(defaultValue = "DESC") Sort.Direction sortOrder) {
        return customerService.fetchCustomerDataAsPageWithFilteringAndSorting(firstNameFilter, lastNameFilter, page, size, sortList, sortOrder.toString());
    }

    /**
     * @param firstNameFilter Filter for the first Name if required
     * @param lastNameFilter  Filter for the last Name if required
     * @param page            number of the page returned
     * @param size            number of entries in each page
     * @param sortList        list of columns to sort on
     * @param sortOrder       sort order. Can be ASC or DESC
     * @return PagedModel object in Hateoas with customers after filtering and sorting
     */
    @GetMapping("/api/v4/customer")
    public PagedModel<CustomerModel> fetchCustomersWithPagination(
            @RequestParam(defaultValue = "") String firstNameFilter,
            @RequestParam(defaultValue = "") String lastNameFilter,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "30") int size,
            @RequestParam(defaultValue = "") List<String> sortList,
            @RequestParam(defaultValue = "DESC") Sort.Direction sortOrder) {
        Page<Customer> customerPage = customerService.fetchCustomerDataAsPageWithFilteringAndSorting(firstNameFilter, 
                                                                                                    lastNameFilter, 
                                                                                                    page, 
                                                                                                    size, 
                                                                                                    sortList, 
                                                                                                    sortOrder.toString());
        // Use the pagedResourcesAssembler and customerModelAssembler to convert data to PagedModel format
            
        PagedModel<CustomerModel> pagedModel = pagedResourcesAssembler.toModel(customerPage, customerModelAssembler);

        return pagedModel;
    }



    /**
     * Saves a customer to the database.
     * 
     * Example post with curl:
     * 
     * curl -X POST http://localhost:8080/v1/api/employee/create \\n   -H 'Content-Type: application/json' \\n   -d '{"firstName":"Bill","lastName":"Polinchak",city":"Venice"}'
     * 
     * @param customer The customer in json format.
     * @return The customer along with its primary key.
     * @throws Exception If the customer can't be stored.
     */
    @RequestMapping(value = "/api/v1/customer", method = RequestMethod.POST, consumes = "application/json")
    public EntityModel<Customer> saveCustomer(@RequestBody Customer customer) throws Exception {
        log.info("Saving customer {}",customer.getFirstName());
        Customer savedEmployee = customerService.saveCustomer(customer);
        return retrieveCustomer(savedEmployee.getId());
    }

    @PutMapping(value= "/api/v1/customer/{id}")
    public EntityModel<Customer> updateCustomer(@PathVariable(value = "id") Long id, @RequestBody Customer customer) throws Exception {
        customer.setId(id);
        Customer updatedCustomer = customerService.updateCustomer(customer);
        return retrieveCustomer(updatedCustomer.getId());
    }
}
