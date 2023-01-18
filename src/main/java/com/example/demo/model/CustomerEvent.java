package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Table(name = "customer_event")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class CustomerEvent extends Customer {

    /**
    * Used to track the state of the customer.
    */
    @Enumerated(EnumType.STRING)
    private State state;

    public CustomerEvent() {
        
    }
        
    public CustomerEvent(State state, Customer customer) {
        this.state = state;
        super.setCity(customer.getCity());
        super.setFirstName(customer.getFirstName());
        super.setLastName(customer.getLastName());
        super.setCreditLimit(customer.getCreditLimit());
    }
 
    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }
    
}
