package com.springsecurity.test.dao;

import java.util.List;

import com.springsecurity.test.entity.Customer;

public interface CustomerDao {

	List<Customer> getCustomers();

	void saveCustomer(Customer theCustomer);

	Customer getCustomer(int theId);

	void deleteCustomer(int theId);

	List<Customer> searchCustomer(String search);
	
}
