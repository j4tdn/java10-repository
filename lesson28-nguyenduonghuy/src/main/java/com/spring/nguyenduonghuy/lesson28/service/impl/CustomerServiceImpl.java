package com.spring.nguyenduonghuy.lesson28.service.impl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.spring.nguyenduonghuy.lesson28.entity.Customer;
import com.spring.nguyenduonghuy.lesson28.repository.CustomerRepository;
import com.spring.nguyenduonghuy.lesson28.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	private static final int IS_PRESENT = 0;
	private static final int IS_DELETED = 1;

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	@Transactional
	public Page<Customer> getPaginated(int pageNo, int pageSize, String sortBy, String order) {
		boolean isAsc = Sort.Direction.ASC.name().equalsIgnoreCase(order);
		Sort sort = isAsc ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
		return this.customerRepository.findByIsDeleted(IS_PRESENT, pageable);
	}

	@Override
	@Transactional
	public Customer get(int customerId) {
		return this.customerRepository.findById(customerId).orElse(null);
	}

	@Override
	@Transactional
	public void save(Customer customer) {
		customer.setIsDeleted(IS_PRESENT);
		this.customerRepository.save(customer);
	}

	@Override
	@Transactional
	public void delete(int customerId) {
		Optional<Customer> opCustomer = this.customerRepository.findById(customerId);
		if (opCustomer.isPresent()) {
			Customer customer = opCustomer.get();
			customer.setIsDeleted(IS_DELETED);
			this.customerRepository.save(customer);
		}
	}
}
