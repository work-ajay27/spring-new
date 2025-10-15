package com.tka.resources;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;

import com.tka.beans.Address;
import com.tka.beans.User;

//@Configuration
public class AppConfig {
	@Bean
	public Address createAddObj() {
		Address address = new Address(425412, "Nandurbar");

		return address;
	}

	@Bean
	public User createUserObj() {
		User user = new User(1, "Ajay", createAddObj()); // <------- Dependency Injection
		return user;
	}

}
