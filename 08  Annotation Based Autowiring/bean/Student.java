package com.tka.bean;

import org.springframework.beans.factory.annotation.Autowired;

//1. Annotation Based Autowiring
public class Student {
	private int studId;
	private String studName;
	@Autowired
	private Address address;

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void display() {

		System.out.println(studId);
		System.out.println(studName);
		System.out.println(address);
	}
}
