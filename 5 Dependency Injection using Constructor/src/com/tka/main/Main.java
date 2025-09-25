package com.tka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tka.beans.Employee;

public class Main {
	public static void main(String[] args) {

		String config_file_location = "com/tka/resource/applicationProperties.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_file_location);
		
		Employee employee= (Employee)context.getBean("empId");
		employee.display();
	}
}
