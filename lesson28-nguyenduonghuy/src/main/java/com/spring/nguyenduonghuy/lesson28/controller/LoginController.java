package com.spring.nguyenduonghuy.lesson28.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.nguyenduonghuy.lesson28.common.Path;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String showMyLoginPage() {
		return Path.LOGIN_PAGE;
	}

	@GetMapping("/forbidden")
	public String showAccessDenied() {
		return Path.FORBIDDEN_PAGE;
	}
}
