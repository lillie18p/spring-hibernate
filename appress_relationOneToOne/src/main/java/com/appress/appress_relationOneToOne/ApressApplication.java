package com.appress.appress_relationOneToOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.appress.appress_relationOneToOne.controller.AppressController;
import com.appress.appress_relationOneToOne.entity.address.Address;
import com.appress.appress_relationOneToOne.entity.customer.Customer;



@SpringBootApplication
public class ApressApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApressApplication.class, args);

	}

}
