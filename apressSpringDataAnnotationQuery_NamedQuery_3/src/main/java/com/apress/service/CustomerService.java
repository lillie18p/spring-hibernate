package com.apress.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apress.dao.CustomerRepository;
import com.apress.entity.Customer;

@Service
public class CustomerService {

	CustomerRepository customerRepository;
	
	@Autowired
	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	
	public List<Customer> getAllCustomer(String surname){
		List<Customer> customers = customerRepository.findBySurname_NameQuery(surname);
		return customers;
	}
	
	
}
