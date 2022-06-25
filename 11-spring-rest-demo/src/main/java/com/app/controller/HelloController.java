package com.app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
@CrossOrigin
public class HelloController {
	
	// End point: http//localhost:8080/11-spring-rest-demo/api/test/hello
	
	@GetMapping("/hello")
	public String hello() {
		return "<== REST API - HELLO WORLD ==>";
	}
}
