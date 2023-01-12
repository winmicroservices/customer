package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.example.demo.model.Customer;
import com.example.demo.util.Util;

public class UtilTests {

    @Test
    public void testObjectToString() throws Exception {
      Customer c = new Customer("Bill", "Polinchak", "Venice");
      String s = Util.asJsonString(c);
      assertTrue(s.contains("Polinchak"));
    }
    
}
