package com.blcelc;

public class EmployeeSalaryCalculator {
	String EmployeeName;
	double basicSalary;
	
	public EmployeeSalaryCalculator(String EmployeeName, double basicSalary) {
		this.EmployeeName=EmployeeName;
		this.basicSalary=basicSalary;
		
		
		}
	public double calculateHRA() {
		return basicSalary * 20/100;
	}
	
	public double calculateDA() {
		return basicSalary * 10/100;
	}
	
	public double calculateGrossSalary() {
		return basicSalary + calculateHRA() + calculateDA(); 
	}
	public void displaySalaryDetails() {
		System.out.println("Employee Salary Details");
		System.out.println("---------------------------");
		System.out.println("Employee Name : " + EmployeeName );
		System.out.println("Basic Salary : " + basicSalary );
		System.out.println("HRA : " + calculateHRA());
		System.out.println("DA : " + calculateDA());
		System.out.println("Gross Salary : " + calculateGrossSalary());
	}
	
}
