package com.springmvc.service;

import java.util.List;

import com.springmvc.entity.Customer;

public interface CustomerService {
	
	List<Customer> getAll(int offset, int rowcount);

	int countTotalRecords();
}
