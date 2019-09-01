package com.apress.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.apress.entity.Customer;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Integer> {

	 List<Customer> findBySurname_NameQuery(String surname);
}
