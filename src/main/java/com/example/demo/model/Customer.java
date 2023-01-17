package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.extern.slf4j.Slf4j;
  
/**
 * This class models a customer in a database.
 */
@Table(name = "customer")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Slf4j
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Customer {
    
    // @ID This annotation specifies 
    // the primary key of the entity.
    @Id
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