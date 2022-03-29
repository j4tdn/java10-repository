package com.spring.nguyenduonghuy.lesson28.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.spring.nguyenduonghuy.lesson28.entity.User;

public interface UserService extends UserDetailsService {

	User get(String username);
	
	void save(User user);
}
