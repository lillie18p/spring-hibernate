package com.appress.appress_relationOneToOneJacksonBidirectional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class ApressApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApressApplication.class, args);
		
//		ConfigurableApplicationContext context = SpringApplication.run(ApressApplication.class, args);
//		AppressController control = context.getBean(AppressController.class);
//		Customer customer=control.getCustomerByAddress(5);
//		System.out.println(customer);
	}

}
