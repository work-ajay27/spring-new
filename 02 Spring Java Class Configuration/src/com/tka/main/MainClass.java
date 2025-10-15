package com.tka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tka.bean.Student;
import com.tka.resources.Appconfig;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
//		Student stud = (Student) context.getBean(Student.class);
//		OR
		Student stud=context.getBean(Student.class);
		stud.display();
	}
}
