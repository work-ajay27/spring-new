package com.tka.main;

import javax.security.auth.login.AppConfigurationEntry;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tka.bean.Student;
import com.tka.resources.Appconfig;

public class MainClass {
	public static void main(String[] args) {

//		1) For XML based Annotation Configuratiom

//		String resource_file_path = "com/tka/resources/applicationContext.xml";
//		ApplicationContext context = new ClassPathXmlApplicationContext(resource_file_path);
//		Student stud = (Student)context.getBean("student");
//		stud.display();

//		2.For Class based Annotation Configuratiom

		ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
		Student student = (Student) context.getBean("student");
		student.display();

	}
}

// In annotation configuration we have to scan the component
