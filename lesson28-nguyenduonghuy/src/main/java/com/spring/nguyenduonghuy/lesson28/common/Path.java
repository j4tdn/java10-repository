package com.spring.nguyenduonghuy.lesson28.common;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Path {

	public static final String HOME_PAGE = "home/home-page";
	public static final String EMPLOYEE_PAGE = "home/employee-page";
	public static final String MANAGER_PAGE = "home/manager-page";
	public static final String ADMIN_PAGE = "home/admin-page";
	public static final String LIST_PAGE = "customer/list-page";
	public static final String FORM_PAGE = "customer/form-page";
	public static final String REDIRECT_LIST_PAGE = "redirect:/customer/page/1";
	public static final String LOGIN_PAGE = "login/login-page";
	public static final String FORBIDDEN_PAGE = "login/forbidden-page";
	
}
