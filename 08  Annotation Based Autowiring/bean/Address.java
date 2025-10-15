package com.tka.bean;

public class Address {
	private int houseNo;
	private String houseName;
	private String village;

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public String getHouseName() {
		return houseName;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", houseName=" + houseName + ", village=" + village + "]";
	}

}
