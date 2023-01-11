package com.example.demo.util;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
* This class contains some utility methods.
*/
public class Util {

    /**
     * Returns a json representation of an object.
     * @param obj The object to be converted.
     * @return A json representation of the object.
     * @throws Exception If something breaks.
     */
    public static String asJsonString(final Object obj) throws Exception {
		return new ObjectMapper().writeValueAsString(obj);
	}
}
