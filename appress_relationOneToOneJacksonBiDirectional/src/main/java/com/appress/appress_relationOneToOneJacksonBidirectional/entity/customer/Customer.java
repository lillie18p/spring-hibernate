package com.appress.appress_relationOneToOneJacksonBidirectional.entity.customer;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.appress.appress_relationOneToOneJacksonBidirectional.entity.address.Address;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="Customer")
@Getter
@Setter
@NoArgsConstructor
public class Customer{
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String name;
	
	@Column(name="last_name")
	private String surname;
	
	@Column(name="email")
	private String email;
	
	@Column(name="mobile")
	private String mobile;
	
	@Column(name="purchase_date")
	private String purchaseDate;
	
	@Column(name="delivery_date")
	private String deliveryDate;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id", 
	            nullable = false)
	@JsonManagedReference
	private Address address;
	
	public String toJson() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.toJson(this);
	}

}
