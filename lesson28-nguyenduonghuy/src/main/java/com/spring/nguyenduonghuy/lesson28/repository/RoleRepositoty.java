package com.spring.nguyenduonghuy.lesson28.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.nguyenduonghuy.lesson28.entity.Role;

@Repository
public interface RoleRepositoty extends JpaRepository<Role, Integer> {

}
