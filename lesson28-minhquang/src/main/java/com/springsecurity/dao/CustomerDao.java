package com.springsecurity.dao;

import java.util.List;

import com.springsecurity.entity.Customer;

public interface CustomerDao {
	
	List<Customer> getAll(int offset, int rowcount);
	
	List<Customer> getAll(int offset, int rowcount, String sort);
	
	int countTotalRecords();

	Customer get(Integer customerId);

	List<Customer> search(String customerName);

	void save(Customer customer);

	void delete (Integer customerId);	

}
