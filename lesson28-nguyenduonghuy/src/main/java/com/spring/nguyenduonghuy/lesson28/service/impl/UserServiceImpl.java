package com.spring.nguyenduonghuy.lesson28.service.impl;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.spring.nguyenduonghuy.lesson28.entity.Role;
import com.spring.nguyenduonghuy.lesson28.entity.User;
import com.spring.nguyenduonghuy.lesson28.repository.UserRepository;
import com.spring.nguyenduonghuy.lesson28.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private static final String NO_USER_FOUND_BY_USERNAME = "No user found by username: ";
	
	@Autowired
	private UserRepository userRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = this.userRepository.findByUsername(username);
		if (Objects.isNull(user)) {
			throw new UsernameNotFoundException(NO_USER_FOUND_BY_USERNAME + username);
		}
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), getAuthorities(user.getRoles()));
	}

	@Override
	@Transactional
	public User get(String username) {
		return this.userRepository.findByUsername(username);
	}

	@Override
	@Transactional
	public void save(User user) {
		this.userRepository.save(user);
	}
	
	private Collection<? extends GrantedAuthority> getAuthorities(List<Role> roles) {
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
	}
}
