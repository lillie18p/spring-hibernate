package com.apress.apress.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apress.apress.dao.CustomerRepository;
import com.apress.apress.entity.Customer;

@Service
public class CustomerService {

	CustomerRepository customerRepository;
	
	@Autowired
	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	
	public List<Customer> getAllCustomer(){
		return customerRepository.findAll();
	}
	
	public Customer getCustomer(Integer id) {
		Customer customer=null;
		Optional<Customer> result =customerRepository.findById(id);
		if(result.isPresent()) {
			customer= result.get();
		}else {
			throw new RuntimeException("Not employee id "+id);
		}
		return customer;
	}
	
	public  List<Customer>   getCustomerByLastname(String lastname) {
		 List<Customer>  customerList=null;
		 List<Customer>  result =customerRepository.findBySurname(lastname);
		if(result !=null) {
			customerList = result;
		}else {
			throw new RuntimeException("Not employee id "+lastname);
		}
		return customerList;
	}
	
	public void saveCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	

	public void removeCustomer(Integer id) {
		customerRepository.deleteById(id);
	}
}
