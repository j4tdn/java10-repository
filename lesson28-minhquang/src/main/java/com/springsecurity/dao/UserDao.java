package com.springsecurity.dao;

import com.springsecurity.entity.User;

public interface UserDao {

	User findUserByUserName(String username);

	void save(User user);
	
}
