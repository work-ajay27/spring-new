package com.tka.beans;

public class Student {
	private int rollNo;
	private String studName;
	private Address address;

//	Dependency Injection By using Setter Methods.
	
	
	public void setRollNo(int rollNo) {
		System.out.println("Setter Roll No");
		this.rollNo = rollNo;
	}




	public void setStudName(String studName) {
		System.out.println("Setter Stud Name");
		this.studName = studName;
	}




	public void setAddress(Address address) {
		System.out.println("Setter Stud Address");
		this.address = address;
	}




	public void display() {
		System.out.println("Roll No :" + rollNo);
		System.out.println("Name :" + studName);
		System.out.println("Address :" + address);
	}

}
