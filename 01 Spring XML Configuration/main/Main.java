package com.tka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tka.bean.Student;

public class Main {
	public static void main(String[] args) {

		String configLocation = "/com/tka/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);

//			ApplicationContext it is an interface we cannot create object of it spring create ClassPathXmlApplicationContext() implemented class and we create object with it.

//		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation); this line will start spring container
		Student stud = (Student) context.getBean("studId");
		stud.display();
	}
}

//1. spring beans
//2 spring core
//3 spring context
//4 common logging
//5 spring expression
