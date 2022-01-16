package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static com.springmvc.common.Application.*;

import java.util.List;
import java.util.stream.Collectors;

import com.springmvc.entity.Customer;
import com.springmvc.service.CustomerService;

@Controller
@RequestMapping("customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@GetMapping
	public String index(ModelMap modelMap, @RequestParam(name = "page", defaultValue = "1") int page,
			@RequestParam(name = "text", defaultValue = "") String text) {
		
		int totalRecords = customerService.countTotalRecords();
		int totalPages = (int)Math.ceil((float)totalRecords/RECORDS_PER_PAGE); // 4 3.333
		page = page < 1 ? 1 : page;
		page = page > totalPages ? totalPages : page;
		int offset = (page - 1) * RECORDS_PER_PAGE;
		
		List<Customer> customers = customerService.getAll(offset, RECORDS_PER_PAGE);
		if (!text.isEmpty()) {
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
	public String add() {
		return CUSTOMER_FORM_PAGE;
	}
}
