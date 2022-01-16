package com.springmvc.dao;

import java.util.List;

import com.springmvc.entity.Customer;

public interface CustomerDao {
	List<Customer> getAll(int offset, int rowcount);

	int countTotalRecords();
}
