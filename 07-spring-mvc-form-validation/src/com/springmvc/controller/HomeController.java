package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.common.Application;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		return Application.MENU_PAGE;
	}

}
