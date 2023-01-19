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
class RestControllerTests {

	@Autowired
	private MockMvc mvc;

	@Test
	void testCustomers() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/api/v0/customers")).andExpect(status().isOk());
	}

	@Test
	public void testHateOSCustomers() throws Exception {
		mvc.perform( MockMvcRequestBuilders
				.post("/api/v1/customer/create")
				.content(Util.asJsonString(new Customer("William", "Polinchak", "Venice")))
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
			.andExpect(status().is(200));

		mvc.perform(MockMvcRequestBuilders
			.get("/api/v4/customers?firstNameFilter=W&lastNameFilter=P&page=0&size=5&sortList=firstName&sortOrder=ASC"))
			.andExpect(status().isOk());
	}

	@Test
	public void createCustomer() throws Exception {
		mvc.perform( MockMvcRequestBuilders
				.post("/api/v1/customer/create")
				.content(Util.asJsonString(new Customer("William", "Polinchak", "Venice")))
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
			.andExpect(status().is(200));
	}

	@Test
	public void updateCustomer() throws Exception {
		mvc.perform( MockMvcRequestBuilders
				.post("/api/v1/customer/create")
				.content(Util.asJsonString(new Customer("William", "Polinchak", "Venice")))
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
			.andExpect(status().is(200));

		mvc.perform( MockMvcRequestBuilders
			.put("/api/v1/customer/update/1")
			.content(Util.asJsonString(new Customer("William", "Polinchak", "Atlanta")))
			.contentType(MediaType.APPLICATION_JSON)
			.accept(MediaType.APPLICATION_JSON))
			.andExpect(status().is(200));
	}

	

}
