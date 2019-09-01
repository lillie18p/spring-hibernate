package com.appress.appress_relationOneToOne.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.appress.appress_relationOneToOne.entity.customer.Customer;
import com.appress.appress_relationOneToOne.entity.customer.CustomerRepository;

@Service
public class CustomerService {
	
	CustomerRepository customerRepository;
	
	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	public List<Customer> selectAllCustomer() {
		return customerRepository.findAll();
	}

	
	public void insertCustomer(Customer customer) {
		customerRepository.save(customer);
	}
}
