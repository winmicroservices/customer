package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Table(name = "customer_history")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class CustomerHistory extends Customer {

    /**
    * Used to track the state of the customer.
    */
    @Enumerated(EnumType.STRING)
    private State state;
        
    public CustomerHistory(State state, Customer customer) {
        this.state = state;
        super.setCity(customer.getCity());
        super.setFirstName(customer.getFirstName());
        super.setLastName(customer.getLastName());
    }
 
    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }
    
}
