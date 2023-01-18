package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.model.Event;
import com.example.demo.model.State;
import com.example.demo.rest.repository.CustomerEventRepository;
import com.example.demo.rest.repository.CustomerRepository;
import com.example.demo.util.Util;

import lombok.extern.slf4j.Slf4j;

/**
* Spring service for the customer api.
*/
@Service
@Slf4j
public class CustomerService {

    /**
    * Dao for the customer repository.
    */
    @Autowired
    private CustomerRepository customerRepository;

    /**
    * Dao for the customer history.
    */
    @Autowired
    private CustomerEventRepository customerHistoryRepository;

    public Customer saveCustomer(Customer customer) throws Exception {
        log.info("Saving customer {}",customer.getLastName());
        Customer newCustomer = customerRepository.save(customer);
        Event event = new Event(State.INSERT,newCustomer.getId(),Util.asJsonString(newCustomer));
        customerHistoryRepository.save(event);
        return newCustomer;
    }

    public Customer getCustomer(Long id) {
        return customerRepository.getReferenceById(id);
    }

    public List<Customer> fetchCustomerDataAsList() {
        // Fetch all customers using findAll
        return customerRepository.findAll();
    }

    public List<Customer> fetchFilteredCustomerDataAsList(String firstNameFilter, String lastNameFilter) {
        // Apply the filter for firstName and lastName
        return customerRepository.findByFirstNameLikeAndLastNameLike(firstNameFilter, lastNameFilter);
    }

    public Page<Customer> fetchCustomerDataAsPageWithFiltering(String firstNameFilter, String lastNameFilter, int page, int size) {
        // create Pageable object using the page and size
        Pageable pageable = PageRequest.of(page, size);
        // fetch the page object by additionally passing pageable with the filters
        return customerRepository.findByFirstNameLikeAndLastNameLike(firstNameFilter, lastNameFilter, pageable);
    }

    public Page<Customer> fetchCustomerDataAsPageWithFilteringAndSorting(String firstNameFilter, String lastNameFilter, int page, int size, List<String> sortList, String sortOrder) {
        // create Pageable object using the page, size and sort details
        Pageable pageable = PageRequest.of(page, size, Sort.by(createSortOrder(sortList, sortOrder)));
        // fetch the page object by additionally passing pageable with the filters
        return customerRepository.findByFirstNameLikeAndLastNameLike(firstNameFilter, lastNameFilter, pageable);
    }


    private List<Sort.Order> createSortOrder(List<String> sortList, String sortDirection) {
        List<Sort.Order> sorts = new ArrayList<>();
        Sort.Direction direction;
        for (String sort : sortList) {
            if (sortDirection != null) {
                direction = Sort.Direction.fromString(sortDirection);
            } else {
                direction = Sort.Direction.DESC;
            }
            sorts.add(new Sort.Order(direction, sort));
        }
        return sorts;
    }

}