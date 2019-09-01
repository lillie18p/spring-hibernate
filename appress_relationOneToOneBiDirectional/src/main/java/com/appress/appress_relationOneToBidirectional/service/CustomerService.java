package com.appress.appress_relationOneToBidirectional.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appress.appress_relationOneToBidirectional.entity.address.Address;
import com.appress.appress_relationOneToBidirectional.entity.address.AddressRepository;
import com.appress.appress_relationOneToBidirectional.entity.customer.Customer;
import com.appress.appress_relationOneToBidirectional.entity.customer.CustomerRepository;

@Service
public class CustomerService {
	
	CustomerRepository customerRepository;
	
	@Autowired
	AddressRepository addressRepository;
	
	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	public List<Customer> getAllCustomer(){
		return customerRepository.findAll();
	}
	public Customer getCustomerAndAddress(int id) {
		
		Customer customer = customerRepository.findById(id).get();
		return customer;
	}
	
	public void saveCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	
	public void removeAddressOfCustomer(int id) {
		Address address=addressRepository.findById(id).get();
		address.getCustomer().setAddress(null);
		addressRepository.deleteById(id);
		customerRepository.save(address.getCustomer());
//		customerRepository.deleteById(id);
	}
}
