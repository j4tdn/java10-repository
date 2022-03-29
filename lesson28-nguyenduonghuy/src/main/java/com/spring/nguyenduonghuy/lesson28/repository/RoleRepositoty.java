package com.spring.nguyenduonghuy.lesson28.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.nguyenduonghuy.lesson28.entity.Role;

public interface RoleRepositoty extends JpaRepository<Role, Integer> {

}
