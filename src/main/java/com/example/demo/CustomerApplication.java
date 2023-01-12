
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class CustomerApplication {

	/**
	 * This is the main method for the Springboot application.
	 * @param args Command line arguments.
	 */
	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}
}
