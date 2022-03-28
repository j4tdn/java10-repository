package com.springsecurity.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.springsecurity.entity.User;
import com.springsecurity.user.CrmUser;

public interface UserService extends UserDetailsService{

	User findUserByUserName(String username);
	
	void save(CrmUser user);
	
}
