package com.tka.beans;

public class Department {

	private int deptId;
	private String deptName;
	private String deptLocation;
	
	
	
	public Department(int deptId, String deptName, String deptLocation) {
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptLocation = deptLocation;
	}



	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", deptLocation=" + deptLocation + "]";
	}
	
	
	
	

//Constructor Dependency Injection

}
