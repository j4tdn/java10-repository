package crm.backend.service;

import java.util.List;

import crm.backend.entity.Customer;

public interface CustomerService {
	
	List<Customer> getAll(int offset, int rowcount);
	
	List<Customer> getAll(int offset, int rowcount, String sort);
	
	List<Customer> getAll();
	
	Customer get(int id);

	int countTotalRecords();
	
	void save(Customer customer);
	
	void delete(int id);
}
