package com.tka.resources;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;

import com.tka.beans.Address;
import com.tka.beans.User;

//@Configuration
public class AppConfig {
	@Bean
	public Address createAddObj() {
		Address address = new Address();
		address.setPincode(425412);
		address.setPlace("Nandurbar");
		return address;
	}
@Bean
	public User createUserObj() {
		User user = new User();
		user.setUserId(101);
		user.setUserName("Sandip");
		user.setAddress(createAddObj()); // <-------   Dependency Injection
		return user;
	}

}
