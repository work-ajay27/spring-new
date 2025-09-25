package com.tka.beans;


public class User {
	private int userId;
	private String userName;
	private Address address;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
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
