package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.extern.slf4j.Slf4j;
  
/**
 * This class models a customer in a database.
 */
@Table(name = "customer")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Slf4j
public class Customer {
    
    // @ID This annotation specifies 
    // the primary key of the entity.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private long id;

    private String firstName;
    private String lastName;
    private Integer creditLimit;
    
    /**
     * Used for tracking the state changes for reporting.
     * We will not store this in this app's database.
     */
    @Transient
    private State state;
    
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

    public State getState() {
        return this.state;
    }
    
    public void setState(State state) {
        this.state = state;
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