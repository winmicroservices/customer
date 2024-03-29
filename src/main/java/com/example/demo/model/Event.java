package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
* This entity is used to collect the changes to the customer.  
* The records will be streamed to an event queue.
*/
@Table(name = "event",
            indexes = {@Index(name = "MESSAGESENT_IDX", columnList = "msg_sent",  unique = false)})
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Event {

    /**
    * Primary key.
    */
    @Id
    @Column(name="event_id")
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private long eventId;

    /**
    * Used to track the state of the customer.
    */
    @Column(name = "action")
    @Enumerated(EnumType.STRING)
    private State state;

    @Column(name = "id")
    private Long id;
    
    /**
     * Used to track if the message was sent to Kafka.
     */
    @Column(name="msg_sent")
    private Boolean messageSent;

    private String payload;
    
    public Event() {
        
    }
    
    public Event(State state, Long id, String payload) {
        this.state = state;
        this.id = id;
        this.payload = payload;
    }
    
    public State getState() {
        return this.state;
    }
    
    public void setState(State state) {
        this.state = state;
    }

    public Boolean getMessageSent() {
        return this.messageSent;
    }
    
    public void setMessageSent(Boolean messageSent) {
        this.messageSent = messageSent;
    }
    
    public String getPayload() {
        return this.payload;
    }
    
    public void setPayload(String payload) {
        this.payload = payload;
    }
}