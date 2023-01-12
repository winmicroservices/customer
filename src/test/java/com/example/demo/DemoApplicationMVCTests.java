package com.example.demo;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.kafka.test.context.EmbeddedKafka;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.model.Customer;
import com.example.demo.util.Util;


@SpringBootTest
@EmbeddedKafka(partitions = 1, brokerProperties = { "listeners=PLAINTEXT://localhost:9092", "port=9092" })
@AutoConfigureMockMvc
class DemoApplicationMVCTests {

	@Autowired
	private MockMvc mvc;

	@Test
	void testCustomers() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/api/v0/customers")).andExpect(status().isOk());
	}

	@Test
	public void createCustomer() throws Exception {
		mvc.perform( MockMvcRequestBuilders
				.post("/api/v1/customer/create")
				.content(Util.asJsonString(new Customer("Bill", "Polinchak", "Venice")))
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
			.andExpect(status().is(200));
	}


}
