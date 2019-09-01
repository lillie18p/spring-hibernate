package com.appress.appress_relationOneToBidirectional.entity.address;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.appress.appress_relationOneToBidirectional.entity.customer.Customer;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="Address")
@Getter
@Setter
@ToString
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="zip_code")
	private String zipCode;
	
	@Column(name="street_name")
	private String streetName;
	
	@Column(name="city")
	private String city;
	
	@Column(name="country")
	private String country;
	
	@OneToOne(mappedBy="address", fetch = FetchType.LAZY, optional = false,
			  cascade= {CascadeType.DETACH,
			  CascadeType.MERGE,
			  CascadeType.PERSIST,
			  CascadeType.REFRESH})
	@JsonBackReference
	private Customer customer;
	
	public Address() {}
	
	public String toJson() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.toJson(this);
	}

}
