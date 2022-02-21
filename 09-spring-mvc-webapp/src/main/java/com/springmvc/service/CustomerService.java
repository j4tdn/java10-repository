package com.springmvc.service;

import java.util.List;

import com.springmvc.entity.Customer;

public interface CustomerService {
	
	List<Customer> getAll(int offset, int rowcount);
	
	List<Customer> getAll(int offset, int rowcount, String sort);

	int countTotalRecords();

	void save(Customer customer);

	Customer get(int id);

	void delete(int id);
}
