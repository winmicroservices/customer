package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Customer;
import com.example.demo.rest.repository.CustomerRepository;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Transactional
@Slf4j
public class RepositoryTests {

    @Configuration
	@EnableAutoConfiguration
	static class Config {}

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void testCustomerInsert() throws Exception {
        Customer customer = new Customer();
        customer.setFirstName("Bill");
        customer.setLastName("Polinchak");
        customer.setCity("Venice");
        log.info("Saving customer {}",customer.getFirstName());
        customerRepository.save(customer);
        Customer foundEmployee = customerRepository.findByFirstName("Bill");
        assertEquals(foundEmployee.getFirstName(), customer.getFirstName());
    }

    @Test
    public void testCustomerUpdate() throws Exception {
        Customer customer = new Customer();
        customer.setFirstName("Bill");
        customer.setLastName("Polinchak");
        customer.setCity("Venice");
        log.info("Saving customer {}",customer.getFirstName());
        customerRepository.save(customer);
        Customer foundEmployee = customerRepository.findByFirstName("Bill");
        assertEquals(foundEmployee.getFirstName(), customer.getFirstName());

        foundEmployee.setFirstName("William");
        Customer updatedCustomer = customerRepository.save(foundEmployee);
        assertEquals(updatedCustomer.getFirstName(), "William");
    }

    @Test
    public void testDelete() throws Exception {
        Customer customer = new Customer();
        customer.setFirstName("Bill");
        customer.setLastName("Polinchak");
        customer.setCity("Venice");
        log.info("Saving customer {}",customer.getFirstName());
        customerRepository.save(customer);
        Customer foundEmployee = customerRepository.findByFirstName("Bill");
        assertEquals(foundEmployee.getFirstName(), customer.getFirstName());

        customerRepository.deleteById(foundEmployee.getId());

        assertFalse(customerRepository.existsById(foundEmployee.getId()));
        
    }

}