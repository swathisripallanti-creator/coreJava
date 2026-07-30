package com.thisKeyword;

public class Employee {
	int empId;
	String empName;
	double empSalary;
	
	
	public void setEmployeeDetails(int empId, String empName, double empSalary) {
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
	}
	
	public void displayDetails() {
		System.out.println("Employee Details");
		System.out.println("-----------------------");
		System.out.println("Employee ID : " + empId);
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee Salary : " + empSalary);
		
	}
}
	