package com.springsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springsecurity.dao.CustomerDao;
import com.springsecurity.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Override
	public List<Customer> getAll(int offset, int rowcount) {
		return customerDao.getAll(offset, rowcount);
	}

	@Override
	public List<Customer> getAll(int offset, int rowcount, String sort) {
		// TODO Auto-generated method stub
		return customerDao.getAll(offset, rowcount, sort);
	}

	@Override
	public int countTotalRecords() {
		return customerDao.countTotalRecords();
	}

	@Override
	public Customer get(Integer customerId) {
		return customerDao.get(customerId);
	}

	@Override
	public List<Customer> search(String customerName) {
		return customerDao.search(customerName);
	}

	@Override
	public void save(Customer customer) {
		customerDao.save(customer);
	}

	@Override
	public void delete(Integer customerId) {
		customerDao.delete(customerId);
	}
}
