package com.tka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tka.bean.Student;

public class Main {
	public static void main(String[] args) {
		String location = "com/tka/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(location);

		Student stud = (Student) context.getBean("STUDENT");
		stud.display();
	}
}
