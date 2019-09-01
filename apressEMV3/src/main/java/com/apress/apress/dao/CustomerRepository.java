package com.apress.apress.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apress.apress.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	 List<Customer>  findBySurname(String name);
}
