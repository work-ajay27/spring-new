package com.tka.beans;


public class User {
	private int userId;
	private String userName;
	private Address address;
	
//	Constructor Dependency Injection
	public User(int userId, String userName, Address address) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.address = address;
	}

	public void display() {
		System.out.println("ID :"+userId);
		System.out.println("Name"+userName);
		System.out.println("Address :"+address);
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", address=" + address + "]";
	}
	
	
	
}
