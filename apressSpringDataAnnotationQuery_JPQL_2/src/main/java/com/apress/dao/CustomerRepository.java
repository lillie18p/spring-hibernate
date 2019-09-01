package com.apress.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.data.jpa.repository.Query;

import com.apress.entity.Customer;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	
	@Query("SELECT u FROM Customer u WHERE u.surname = ?1")
	List<Customer> findBySurname_JPQL(String surname);

	@Query("SELECT u FROM Customer u WHERE u.surname LIKE %?1%")
	List<Customer> findBySurnameLike_JPQL(String surname);

	@Query("SELECT u FROM Customer u WHERE u.name = :name and u.surname = :surname")
	Customer findUserByNameAndSurnameNamedParams_JPQL(
			@Param("name") String name,
			@Param("surname") String surname);
}
