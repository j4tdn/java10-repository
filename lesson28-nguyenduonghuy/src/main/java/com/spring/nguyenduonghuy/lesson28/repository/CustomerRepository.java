package com.spring.nguyenduonghuy.lesson28.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.nguyenduonghuy.lesson28.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	Page<Customer> findByIsDeleted(int isDeleted, Pageable pageable);

}
