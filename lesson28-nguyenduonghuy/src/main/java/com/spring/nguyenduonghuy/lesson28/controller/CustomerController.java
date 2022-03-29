package com.spring.nguyenduonghuy.lesson28.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.nguyenduonghuy.lesson28.common.Path;
import com.spring.nguyenduonghuy.lesson28.entity.Customer;
import com.spring.nguyenduonghuy.lesson28.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	private static final int PAGE_SIZE = 5;
	private static final String ASCENDING = "asc";
	private static final String DESCENDING = "desc";

	@Autowired
	private CustomerService customerService;

	@GetMapping("/page/{pageNo}")
	public String getCustomerPagianted(@PathVariable int pageNo, 
			@RequestParam(defaultValue = "firstName") String sortBy,
			@RequestParam(defaultValue = ASCENDING) String order,
			Model model) {
		Page<Customer> pageCustomer = this.customerService.getPaginated(pageNo, PAGE_SIZE, sortBy, order);
		List<Customer> listCustomer = pageCustomer.getContent();
		int totalPages = pageCustomer.getTotalPages();
		long totalElements = pageCustomer.getTotalElements();
		String reverseOrder = ASCENDING.equals(order) ? DESCENDING : ASCENDING;
		
		model.addAttribute("listCustomer", listCustomer);
		model.addAttribute("totalPages", totalPages);
		model.addAttribute("totalElements", totalElements);
		model.addAttribute("sortBy", sortBy);
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("order", order);
		model.addAttribute("reverseOrder", reverseOrder);
		
		return Path.LIST_PAGE;
	}
	
	@GetMapping("/add")
	public String addCustomer(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return Path.FORM_PAGE;
	}
	
	@GetMapping("/update/{customerId}")
	public String updateCustomer(@PathVariable int customerId, Model model) {
		Customer customer = this.customerService.get(customerId);
		if (Objects.nonNull(customer)) {
			model.addAttribute("customer", customer);
		} else {
			model.addAttribute("error", "Customer doesn't exist");
		}
		return Path.FORM_PAGE;
	}
	
	@PostMapping("/save")
	public String saveCustomer(@ModelAttribute Customer customer) {
		this.customerService.save(customer);
		return Path.REDIRECT_LIST_PAGE;
	}
	
	@GetMapping("/delete/{customerId}")
	public String deleteCustomer(@PathVariable int customerId) {
		this.customerService.delete(customerId);
		return Path.REDIRECT_LIST_PAGE;
	}
}
