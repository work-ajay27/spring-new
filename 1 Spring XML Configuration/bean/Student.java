package com.tka.bean;

public class Student {
	private int studId;
	private String studName;
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
