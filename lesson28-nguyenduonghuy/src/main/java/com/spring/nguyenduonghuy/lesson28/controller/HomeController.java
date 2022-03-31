package com.spring.nguyenduonghuy.lesson28.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.nguyenduonghuy.lesson28.common.Path;
import com.spring.nguyenduonghuy.lesson28.entity.Role;
import com.spring.nguyenduonghuy.lesson28.entity.User;

@Controller
@RequestMapping("/home")
public class HomeController {

	@GetMapping()
	public String homePage(HttpSession session, Model model) {
		User user = (User) session.getAttribute("user");
		String username = user.getUsername();
		String firstName = user.getFirstName();
		String lastName = user.getLastName();
		List<String> roles = user.getRoles().stream()
								 .map(Role::getName)
								 .collect(Collectors.toList());
		
		model.addAttribute("username", username);
		model.addAttribute("firstName", firstName);
		model.addAttribute("lastName", lastName);
		model.addAttribute("roles", roles);
		
		return Path.HOME_PAGE;
	}
	
	@GetMapping("/manager")
	public String managerPage(HttpSession session, Model model) {
		User user = (User) session.getAttribute("user");
		String firstName = user.getFirstName();
		String lastName = user.getLastName();
		
		model.addAttribute("firstName", firstName);
		model.addAttribute("lastName", lastName);
		return Path.MANAGER_PAGE;
	}
	
	@GetMapping("/admin")
	public String adminPage(HttpSession session, Model model) {
		User user = (User) session.getAttribute("user");
		String firstName = user.getFirstName();
		String lastName = user.getLastName();
		
		model.addAttribute("firstName", firstName);
		model.addAttribute("lastName", lastName);
		return Path.ADMIN_PAGE;
	}
}
