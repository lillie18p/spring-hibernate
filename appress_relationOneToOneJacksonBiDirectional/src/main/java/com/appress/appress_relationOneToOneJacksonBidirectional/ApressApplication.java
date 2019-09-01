package com.appress.appress_relationOneToOneJacksonBidirectional;

import java.io.FileReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.appress.appress_relationOneToOneJacksonBidirectional.controller.AppressController;
import com.appress.appress_relationOneToOneJacksonBidirectional.entity.address.Address;
import com.appress.appress_relationOneToOneJacksonBidirectional.entity.customer.Customer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;



@SpringBootApplication
public class ApressApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApressApplication.class, args);		
		
	}

}
