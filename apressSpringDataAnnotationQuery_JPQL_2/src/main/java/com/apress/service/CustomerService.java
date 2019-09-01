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
	
	public List<Customer> getCustomerBySurname(String surname){
		return customerRepository.findBySurname_JPQL(surname);
	}

	public List<Customer> getCustomerBySurnameLike(String surname){
		return customerRepository.findBySurnameLike_JPQL(surname);
	}

	public Customer findUserByNameAndSurnameNamedParams(String name, String surname){
		return customerRepository.findUserByNameAndSurnameNamedParams_JPQL(name, surname);
	}
	
	
}
