package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.common.Application;
import com.springmvc.model.MockUpData;
import com.springmvc.model.Student;

@Controller
@RequestMapping("student")
public class StudentController {
	
	@GetMapping("/showForm")
	public String show(Model model) {
		// data binding
		model.addAttribute("student", new Student());
		
		// select option
		model.addAttribute("countries", MockUpData.countries());
		
		// radio button
		model.addAttribute("languages", MockUpData.languages());
		
		// check boxes
		model.addAttribute("operatingSystems", MockUpData.os());
		
		return Application.STUDENT_FORM_PAGE;
	}
	
	@PostMapping("/processForm")
	public String process(Model model, @ModelAttribute("student") Student student) {
		// 1. Get info from student form
		
		// 2. Inform success registration to student
		model.addAttribute("student", student);
		
		return Application.STUDENT_SUCCESS_PAGE;
	}
	
}
