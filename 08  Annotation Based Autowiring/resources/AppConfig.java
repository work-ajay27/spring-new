package com.tka.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tka.bean.Address;
import com.tka.bean.Student;

@Configuration
public class AppConfig {
	@Bean
	public Student createStudentBean() {
		Student stud = new Student();
		stud.setStudId(1);
		stud.setStudName("Sora");
//		stud.setAddress(createAddressBean()); // Without Autowiring we can have to write this manually.
		return stud;
	}

	@Bean
	public Address createAddressBean() {
		Address add = new Address();
		add.setHouseNo(22);
		add.setHouseName("Sora's Home");
		add.setVillage("Los Santos");
		return add;
	}
}
