package com.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {
	
	@Value("${en.date.format}")
	private String englandDateFormat;

	@Value("${de.date.format}")
	private String germanyDateFormat;
	
	@GetMapping
	public String startPage() {
		return "Welcome to Start Page - 2022";
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Spring Page - 2022";
	}
	
	@GetMapping("/custom")
	public String custom() {
		return englandDateFormat + ", " + germanyDateFormat;
	}
	
}
