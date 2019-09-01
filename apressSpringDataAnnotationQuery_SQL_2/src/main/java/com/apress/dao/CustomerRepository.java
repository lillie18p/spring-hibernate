package com.apress.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.data.jpa.repository.Query;

import com.apress.entity.Customer;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Modifying;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	//la query wants param of table and column
	@Query( value= "SELECT * FROM Customer u WHERE u.last_name = ?1", nativeQuery=true)
	List<Customer> findBySurname_SQL(String surname);

	@Query(value = "SELECT * FROM Customer u WHERE u.last_name LIKE %?1%", nativeQuery = true)
	List<Customer> findBySurnameLike_SQL(String surname);

//
	@Query(value = "SELECT * FROM Customer u WHERE u.first_name = :name and u.last_name = :surname", nativeQuery = true)
	Customer findUserByNameAndSurnameNamedParams_SQL(
			@Param("name") String name,
			@Param("surname") String surname);


//	@Modifying
//	@Query(value = "insert into Customer (first_name, last_name, email, mobile, purchaseDate, deliveryDate) values (:first_name, :last_name, :email, :mobile, :purchaseDate, :deliveryDate)",
//			nativeQuery = true)
//	void insertCustomer(@Param("first_name") String name, @Param("last_name") String last_name,
//					    @Param("email") String email, @Param("mobile") String mobile,
//					    @Param("purchaseDate") String purchaseDate, @Param("deliveryDate") String deliveryDate); 



	@Modifying
    @Query("UPDATE Customer c SET c.email = :email WHERE c.id = :customerId")
    int updateAddress(@Param("customerId") int companyId, @Param("email") String email);

}
