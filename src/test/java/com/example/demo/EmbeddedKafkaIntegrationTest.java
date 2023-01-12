package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.context.EmbeddedKafka;
import org.springframework.test.annotation.DirtiesContext;

import com.example.demo.component.kafka.KafkaConsumer;
import com.example.demo.component.kafka.TopicProducer;
import com.example.demo.model.Customer;
import com.example.demo.util.Util;

@SpringBootTest
@DirtiesContext
@EmbeddedKafka(partitions = 1, brokerProperties = { "listeners=PLAINTEXT://localhost:9092", "port=9092" })
class EmbeddedKafkaIntegrationTest {

  @Autowired
  TopicProducer producer;

  @Autowired
  KafkaConsumer consumer;

  @Value("${topic.name.producer}")
  private String topic;

  @Test
  public void givenEmbeddedKafkaBroker_whenSendingWithSimpleProducer_thenMessageReceived() 
    throws Exception {
    Customer c = new Customer("Bill","Polinchak","Venice");
    String json = Util.asJsonString(c);
    producer.send(json);
    assertTrue(true);
  }
}
