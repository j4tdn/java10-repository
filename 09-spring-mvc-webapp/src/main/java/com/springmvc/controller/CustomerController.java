package com.springmvc.controller;

import static com.springmvc.common.Application.CUSTOMER_FORM_PAGE;
import static com.springmvc.common.Application.CUSTOMER_INDEX_PAGE;
import static com.springmvc.common.Application.CUSTOMER_REDIRECT;
import static com.springmvc.common.Application.RECORDS_PER_PAGE;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.entity.Customer;
import com.springmvc.service.CustomerService;
import com.springmvc.utils.SortUtils;

@Controller
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping
	public String index(ModelMap modelMap, 
			@RequestParam(name = "page", defaultValue = "1") int page,
			@RequestParam(name = "text", defaultValue = "") String text,
			@RequestParam(name = "sort", defaultValue = "first_name") String sort) {

		int totalRecords = customerService.countTotalRecords();
		int totalPages = (int) Math.ceil((float) totalRecords / RECORDS_PER_PAGE); // 4 3.333
		page = page < 1 ? 1 : page;
		page = page > totalPages ? totalPages : page;
		int offset = (page - 1) * RECORDS_PER_PAGE;

		// pagination and search in current page
		// could be reversed search before do the pagination
		// List<Customer> customers = customerService.getAll(offset, RECORDS_PER_PAGE);
		
		List<Customer> customers = customerService.getAll(offset, RECORDS_PER_PAGE);
		
		customers.sort((Comparator.comparing(SortUtils.CUSTOMER_SORT_PROPERTIES.get(sort))));
		
		
		if (!text.trim().isEmpty()) { // add trim method
			customers = customers.stream().filter(customer -> {
				return customer.getFirstName().toLowerCase().contains(text.toLowerCase())
						|| customer.getLastName().toLowerCase().contains(text.toLowerCase())
						|| customer.getEmail().toLowerCase().contains(text.toLowerCase());
			}).collect(Collectors.toList());
		}

		modelMap.addAttribute("currentPage", page);
		modelMap.addAttribute("totalPages", totalPages);
		modelMap.addAttribute("customers", customers);

		return CUSTOMER_INDEX_PAGE;
	}
	
	// http://localhost:8080/09-spring-mvc-webapp/customer/add
	@GetMapping("/add")
	public String add(ModelMap modelMap) {
		// data binding
		modelMap.addAttribute("customer", new Customer());
		return CUSTOMER_FORM_PAGE;
	}
	
	@GetMapping("/update")
	public String update(ModelMap modelMap, @RequestParam("id") int id) {
		// data binding
		Customer customer = customerService.get(id);
		modelMap.addAttribute("customer", customer);
		return CUSTOMER_FORM_PAGE;
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("customer") Customer customer) {
		// id = id==null?0:id
		if (customer.getId() == null) {
			customer.setId(0);
		}
		customerService.save(customer);
		// return link @contextPath/customer
		return CUSTOMER_REDIRECT;
	}
	
	@GetMapping("/delete")
	public String delete(ModelMap modelMap, @RequestParam("id") int id) {
		customerService.delete(id);
		return CUSTOMER_REDIRECT;
	}
}
