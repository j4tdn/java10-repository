package com.springmvc.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import com.springmvc.entity.Customer;

public class SortUtils {

	private SortUtils() {

	}

	// TODO: V: non-string
	public static Map<String, Function<Customer, String>> CUSTOMER_SORT_PROPERTIES = new HashMap<String, Function<Customer, String>>() {
		private static final long serialVersionUID = 4293312786696007788L;

		{
			put("first_name", Customer::getFirstName);
			put("last_name", Customer::getLastName);
			put("email", Customer::getEmail);
		}
	};

}
