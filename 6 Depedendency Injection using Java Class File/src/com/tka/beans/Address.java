package com.tka.beans;
public class Address {
	private int pincode;
	private String Place;

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getPlace() {
		return Place;
	}

	public void setPlace(String place) {
		Place = place;
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", Place=" + Place + "]";
	}

}
