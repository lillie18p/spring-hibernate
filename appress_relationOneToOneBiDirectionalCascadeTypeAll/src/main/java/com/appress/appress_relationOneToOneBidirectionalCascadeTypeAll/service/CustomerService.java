package com.appress.appress_relationOneToOneBidirectionalCascadeTypeAll.service;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appress.appress_relationOneToOneBidirectionalCascadeTypeAll.entity.address.Address;
import com.appress.appress_relationOneToOneBidirectionalCascadeTypeAll.entity.address.AddressRepository;
import com.appress.appress_relationOneToOneBidirectionalCascadeTypeAll.entity.customer.Customer;
import com.appress.appress_relationOneToOneBidirectionalCascadeTypeAll.entity.customer.CustomerRepository;

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
	public void shouldUpdateCustomer(Customer customer) {
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
	
	
	/* ================
	 *  BIDIRECTIONAL
	 *  ==============
	 */
	public Customer getAddressAndCustomer(int id){
		Address address =addressRepository.findById(id).get();
		return address.getCustomer();
	}
	
	public List<Customer> getAllAddressOrCustomer() {
		List<Address> listAddress = addressRepository.findAll();
		List<Customer> listCustomer = new ArrayList<>();
		for(Address addressDetails:listAddress) {
			
			listCustomer.add(addressDetails.getCustomer());
		}
		return listCustomer;
		
	}
	
	public Customer updateAddressOrCustomer(Address address) {
		Address addressOld = addressRepository.findById(address.getId()).get();
		addressOld.setStreetName(address.getStreetName());
		addressOld.setCity(address.getCity());
		addressOld.setCountry(address.getCountry());
		addressOld.setZipCode(address.getZipCode());
		Customer customerOld =addressOld.getCustomer();
		customerOld.setName(address.getCustomer().getName());
		customerOld.setSurname(address.getCustomer().getSurname());
		customerOld.setEmail(address.getCustomer().getEmail());
		customerOld.setMobile(address.getCustomer().getMobile());
		customerOld.setPurchaseDate(address.getCustomer().getPurchaseDate());
		customerOld.setDeliveryDate(address.getCustomer().getDeliveryDate());
		addressOld.setCustomer(customerOld);
		addressRepository.save(addressOld);
		return customerOld;
	}
	
	public void removeAddressAndCustomer(int id) {
		addressRepository.deleteById(id);
	}
	
//	public void saveAddressAndCustomer(Address address) {
//		addressRepository.save(address);		
//	}
}
