package com.spring.nguyenduonghuy.lesson28.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.nguyenduonghuy.lesson28.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUsername(String username);
}
