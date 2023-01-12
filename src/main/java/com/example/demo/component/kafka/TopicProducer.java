package com.example.demo.component.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

/**
* Kafka topic service for the customer.
*/
@Component
public class TopicProducer {

    private final static Logger log = LoggerFactory.getLogger(TopicProducer.class);

    @Value("${topic.name.producer}")
    private String topicName;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    /**
     * Sends a create order message to a Kafka topic that tracks new customers.
     * @param message The Customer object in json format.
     */
    public void send(String message){
        log.info("Payload message: {}", message);
        kafkaTemplate.send(topicName, message);
    }

}
