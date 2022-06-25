package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.springmvc.common.Application;

@Controller
public class HomePageControler {
	
	@GetMapping
	public String homepage() {
		System.out.println("hello");
		return Application.HOMEPAGE;
	}
	
}
