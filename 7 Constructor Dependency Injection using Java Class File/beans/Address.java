package com.tka.beans;

public class Address {
	private int pincode;
	private String Place;

//	Constructor Dependency Injection
	public Address(int pincode, String place) {

		this.pincode = pincode;
		Place = place;
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", Place=" + Place + "]";
	}

}
