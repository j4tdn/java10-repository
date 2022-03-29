package com.spring.nguyenduonghuy.lesson28.service;

import org.springframework.data.domain.Page;

import com.spring.nguyenduonghuy.lesson28.entity.Customer;

public interface CustomerService {

	Page<Customer> getPaginated(int pageNo, int pageSize, String sortBy, String order);

	Customer get(int customerId);

	void save(Customer customer);

	void delete(int customerId);
}
