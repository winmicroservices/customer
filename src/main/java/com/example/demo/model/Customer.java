package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.extern.slf4j.Slf4j;
  
/**
 * This class models a customer in a database.
 */
@Table(name = "customer", 
       indexes = { @Index(name = "FIRSTNAME_IDX", columnList = "firstName",  unique = false),
                   @Index(name = "LASTNAME_IDX", columnList = "lastName",  unique = false),
                   @Index(name = "CREDITLIMIT_IDX", columnList = "creditLimit",  unique = false),
                   @Index(name = "CITY_IDX", columnList = "city",  unique = false) })
@Entity
@JsonIgnoreProperties(value = {"id", "hibernateLazyInitializer", "handler"})
@Slf4j
public class Customer {
    
    /**
    * Primary key.
    */
    @Id
    @Column(name="customer_id")
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private long id;
    private String firstName;
    private String lastName;
    private Integer creditLimit;
    private String city;
    
    public Customer() {
        super();
    }
    
    public Customer(String firstName, String lastName, String city) {
        super();
        log.debug("new customer created");
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }
    
    public Integer getCreditLimit() {
        return this.creditLimit;
    }

    public void setCreditLimit(Integer creditLimit) {
        this.creditLimit = creditLimit;
    }

    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public String getFirstName() {
        return firstName;
    }
  
    public void setFirstName(String name) {
        this.firstName = name;
    }
    
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
}