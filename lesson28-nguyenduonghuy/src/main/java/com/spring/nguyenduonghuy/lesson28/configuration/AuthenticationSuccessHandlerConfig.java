package com.spring.nguyenduonghuy.lesson28.configuration;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.spring.nguyenduonghuy.lesson28.entity.User;
import com.spring.nguyenduonghuy.lesson28.service.UserService;

@Component
public class AuthenticationSuccessHandlerConfig implements AuthenticationSuccessHandler {

	@Autowired
	private UserService userService;

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		String username = authentication.getName();
		User user = userService.get(username);

		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		
		response.sendRedirect(request.getContextPath() + "/home");
	}

}
