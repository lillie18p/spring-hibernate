package com.appress.appress_relationOneToBidirectional;

import com.appress.appress_relationOneToOneBidirectionalCascadeTypeAll.entity.address.Address;
import com.appress.appress_relationOneToOneBidirectionalCascadeTypeAll.entity.customer.Customer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

//import org.junit.Test;

public class AppTest {

//	@Test
//	public void givenBidirectionRelation_whenUsingJacksonReferenceAnnotation_thenCorrect() throws JsonProcessingException {
//	  
//	    Customer customer = new Customer( "Viviana", "Brambilla","ale@gmail.com","07865645543","12/4/19","20/04/19");
//	    Address address = new Address( "54 Charle Brown", "London", "UK","sw23 7PR");
//	    customer.setAddress(address);
//	 
//	    String result = new ObjectMapper().writeValueAsString(customer);
//	 
//	    assertThat(result, containsString("Viviana"));
//	    assertThat(result, containsString("Brambilla"));
//	    assertThat(result, containsString("ale@gmail.com"));
//	    assertThat(result, containsString("07865645543"));
//	    assertThat(result, containsString("12/4/19"));
//	    assertThat(result, containsString("20/04/19"))
//	    assertThat(result, not(containsString("userItems")));
//	}
}
