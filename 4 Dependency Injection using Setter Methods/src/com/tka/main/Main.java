package com.tka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tka.beans.Student;

public class Main {
	public static void main(String[] args) {

		String config_file_location = "com/tka/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_file_location);
		Student stud = (Student) context.getBean("studId");
		stud.display();
	}
}
