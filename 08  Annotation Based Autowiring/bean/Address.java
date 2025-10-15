package com.tka.bean;

public class Address {
	private int houseNo;
	private String village;
	private String district;

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", village=" + village + ", district=" + district + "]";
	}

}
