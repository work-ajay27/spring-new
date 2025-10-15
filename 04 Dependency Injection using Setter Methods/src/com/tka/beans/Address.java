package com.tka.beans;

//Setter method DI
public class Address {
	private int houseNo;
	private String HouseName;
	private String City;
	
	
	public void setHouseNo(int houseNo) {
		
		this.houseNo = houseNo;
	}
	public void setHouseName(String houseName) {
		HouseName = houseName;
	}
	public void setCity(String city) {
		City = city;
	}
	
	
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", HouseName=" + HouseName + ", City=" + City + "]";
	}

	

}
