package com.appress.appress_relationOneToOne.entity.customer;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.appress.appress_relationOneToOne.entity.address.Address;

import lombok.Data;


@Entity
@Table(name="Customer")
//@Data
public class Customer implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="first_name")
	private String name;
	
	@Column(name="last_name")
	private String surname;
	
	@Column(name="email")
	private String email;
	
	@Column(name="mobile")
	private String mobile;
	
	@Column(name="purcharse_date")
	private String purchaseDate;
	
	@Column(name="delivery_date")
	private String deliveryDate;
	
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)//fetch=FetchType.EAGER, 
	@JoinColumn(name="address_id")
	private Address address;
	
	public Customer() {}

	public Customer(String name, String surname, String email, String mobile, String purchaseDate,
			String deliveryDate) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.mobile = mobile;
		this.purchaseDate = purchaseDate;
		this.deliveryDate = deliveryDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email + ", mobile="
				+ mobile + ", purchaseDate=" + purchaseDate + ", deliveryDate=" + deliveryDate + ", address=" + address
				+ "]";
	}
	
	
	

}
