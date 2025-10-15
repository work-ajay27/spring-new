package com.tka.beans;

public class Employee {
	private int EmpId;
	private String EmpName;
	private Department EmpDept;

//	Dependency Injection Using Constructor

	public Employee(int empId, String empName, Department empDept) {

		EmpId = empId;
		EmpName = empName;
		EmpDept = empDept;
	}

	public void display() {
		System.out.println("Emp Id :" + EmpId);
		System.out.println("EmpName :" + EmpName);
		System.out.println("Emp Dept :" + EmpDept);
	}

}
