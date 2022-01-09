package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.common.Application;

@Controller
@RequestMapping("customer")
public class CustomerController {
	
	@GetMapping("/")
	public String index() {
		return Application.CUSTOMER_INDEX_PAGE;
	}
	
	@GetMapping("/add")
	public String add() {
		return Application.CUSTOMER_FORM_PAGE;
	}
}
