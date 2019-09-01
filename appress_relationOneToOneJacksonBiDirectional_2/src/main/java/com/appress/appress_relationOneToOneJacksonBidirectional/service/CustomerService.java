package com.appress.appress_relationOneToOneJacksonBidirectional.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appress.appress_relationOneToOneJacksonBidirectional.entity.address.Address;
import com.appress.appress_relationOneToOneJacksonBidirectional.entity.address.AddressRepository;
import com.appress.appress_relationOneToOneJacksonBidirectional.entity.customer.Customer;
import com.appress.appress_relationOneToOneJacksonBidirectional.entity.customer.CustomerRepository;

@Service
public class CustomerService {
	
	CustomerRepository customerRepository;
	
	@Autowired
	AddressRepository addressRepository;
	
	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	public List<Customer> getCustomers(){
		return customerRepository.findAll();
	}
	
	
	public Customer getCustomerAndAddress(int id) {		
		Customer customer = customerRepository.findById(id).get();
		return customer;
	}
	public void shouldSaveCustomer(Customer customer){
		customerRepository.save(customer);
	}
	public void shouldModifyCustomer(Customer customer) {
		Customer customerOld=customerRepository.findById(customer.getId()).get();
		customerOld.setName(customer.getName());
		customerOld.setSurname(customer.getSurname());
		customerOld.setEmail(customer.getEmail());
		customerOld.setMobile(customer.getMobile());
		customerOld.setPurchaseDate(customer.getPurchaseDate());
		customerOld.setDeliveryDate(customer.getDeliveryDate());
		Address addressOld =customerOld.getAddress();
		addressOld.setStreetName(customer.getAddress().getStreetName());
		addressOld.setCity(customer.getAddress().getCountry());
		addressOld.setCountry(customer.getAddress().getCountry());
		addressOld.setZipCode(customer.getAddress().getZipCode());
		customerOld.setAddress(addressOld);
		customerRepository.save(customerOld);
	}
	
	public void removeCustomerAndAddress(int id) {
		customerRepository.deleteById(id);
	}
}
