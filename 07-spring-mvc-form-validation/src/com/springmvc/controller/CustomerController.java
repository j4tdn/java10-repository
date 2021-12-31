package com.springmvc.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.common.Application;
import com.springmvc.model.Customer;

@Controller
@RequestMapping("customer")
public class CustomerController {
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		StringTrimmerEditor stringTrimEditor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimEditor);
	}
	
	@GetMapping("/showForm")
	public String show(Model model) {
		model.addAttribute("customer", new Customer());
		
		return Application.CUSTOMER_FORM_PAGE;
	}
	
	@PostMapping("/processForm")
	public String process(Model model, 
			@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
			return "customer/form";
		}
		
		model.addAttribute("customer", customer);
		
		return Application.CUSTOMER_SUCCESS_PAGE;
	}
	
}
