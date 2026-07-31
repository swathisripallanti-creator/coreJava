package com.Encapsulation;

public class Employee {
	private int EmployeeId;
	private String EmployeeName;
	private String department;
	private double Salary;
	
	public int getEmployeeId() {
		return EmployeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public String getdepartment() {
		return department;
	}
	public double getSalary() {
		return Salary;
	}
	public void setEmployeeId(int EmployeeId) {
		this.EmployeeId=EmployeeId;
	}
	public void setEmployeeName(String EmployeeName) {
		this.EmployeeName=EmployeeName;
	}
	public void setdepartment(String department) {
		this.department=department;
	}
	public void setSalary(double Salary) {
		this.Salary=Salary;
	}
}
