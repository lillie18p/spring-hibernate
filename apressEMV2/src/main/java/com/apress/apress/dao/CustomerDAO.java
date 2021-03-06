package com.apress.apress.dao;

import java.util.List;

import com.apress.apress.entity.Customer;

public interface CustomerDAO {
	//using Hibernate - EntityManager -version 2
	public List<Customer>  findAll();
	
	public Customer findById(Integer id);
	
	public void save(Customer customer);
	
	public void deleteByDid(Integer id);

}
