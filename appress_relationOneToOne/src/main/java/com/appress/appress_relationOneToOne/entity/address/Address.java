package com.appress.appress_relationOneToOne.entity.address;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="Address")
//@Data
public class Address implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="code")
	private String code;
	
	@Column(name="street_name")
	private String streetName;
	
	@Column(name="city")
	private String city;
	
	@Column(name="country")
	private String country;
	
	public Address() {}

	public Address(String code, String streetName, String city, String country) {
		super();
		this.code = code;
		this.streetName = streetName;
		this.city = city;
		this.country = country;
	}

	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public String getStreetName() {
		return streetName;
	}



	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	@Override
	public String toString() {
		return "Address [id=" + id + ", code=" + code + ", streetName=" + streetName + ", city=" + city + ", country="
				+ country + "]";
	}
	
	

}
