package com.tka.bean;

public class Student {
	private int studId;
	private String studName;
	private Address Address;

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
		return Address;
	}

	public void setAddress(Address address) {
		Address = address;
	}

	public void display() {
		System.out.println("ID" + studId);
		System.out.println("Name" + studName);
		System.out.println("Address" + Address);
//		System.out.println("ID" + studId);
		
	}

}
