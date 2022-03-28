package com.springsecurity.controller;

import static com.springsecurity.common.Application.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springsecurity.entity.Customer;
import com.springsecurity.service.CustomerService;
import com.springsecurity.utils.SortUtils;


@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping("/list")
	public String listCustomers(ModelMap modelMap, 
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
	
	@GetMapping("/add")
	public String showFormForAdd(Model theModel) {
		Customer theCustomer = new Customer();
		theModel.addAttribute("customer", theCustomer);
		return CUSTOMER_FORM_PAGE;
	}

	@GetMapping("/delete/{customerId}")
	public String deleteCustomer(@PathVariable("customerId") Integer customerId) {
		customerService.delete(customerId);
		return CUSTOMER_REDIRECT;
	}

	@PostMapping("/save")
	public String saveCustomer(@Valid @ModelAttribute("customer") Customer theCustomer,
			BindingResult theBindingResult) {

		if (theBindingResult.hasErrors()) {
			return CUSTOMER_FORM_PAGE;
		} else {
			customerService.save(theCustomer);
			return CUSTOMER_REDIRECT;
		}
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") Integer customerId, 
									Model theModel) {
		Customer theCustomer = customerService.get(customerId);
		theModel.addAttribute("customer", theCustomer);
		return CUSTOMER_FORM_PAGE;
	}

	@GetMapping("/search")
	public String searchCustomer(@RequestParam(name = "param", required = false) String customerName, 
								Model model) {
		if (customerName == null || customerName.trim().isEmpty()) {
			return CUSTOMER_REDIRECT;
		}
		List<Customer> customers = customerService.search(customerName);
		model.addAttribute("customers", customers);
		return CUSTOMER_INDEX_PAGE;
	}

}
