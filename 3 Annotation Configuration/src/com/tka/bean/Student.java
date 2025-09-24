package com.tka.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
// when we write this annotation then spring container will create Bean object
// automatically
//			we dont need any thing else. But we need to scan the component through 
//<context:component-scan base-package="com.tka.bean"></context:component-scan>
@Component
public class Student {
	@Value("101")
	private int studId;
	@Value("ajay")
	private String studName;
	@Value("ajay@gmail.com")
	private String studEmail;

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudEmail() {
		return studEmail;
	}

	public void setStudEmail(String studEmail) {
		this.studEmail = studEmail;
	}

//	display values
	public void display() {
		System.out.println("Name :" + studName);
		System.out.println("Id :" + studId);
		System.out.println("Email :" + studEmail);
	}

}
