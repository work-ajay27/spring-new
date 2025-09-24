package com.tka.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tka.bean.Student;

@Configuration //this annotation tells IOC Container that this class file is a configuration file.
public class Appconfig {
	@Bean
	public Student student() {
		Student stud = new Student();
		stud.setStudId(201);
		stud.setStudName("Ajay");
		stud.setStudEmail("ajaymali@gmail.com");
		
		return stud;
	}
}


//Why we use @Bean?

//@Bean tells Spring: “The object returned by this method should be managed by Spring as a bean.”
//Without @Bean, Spring would just treat it like a normal method, and it wouldn’t know to create 
//and store that object in its container.

//Because of @Bean, Spring calls this method once and creates a Student object.