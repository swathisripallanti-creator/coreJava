package com.blcelc;
import java.util.Scanner;
public class EmployeeApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee Name : ");
		String EmployeeName=sc.next();
		
		System.out.println("Enter basic salary : ");
		double basicSalary=sc.nextDouble();
		
		EmployeeSalaryCalculator obj=new EmployeeSalaryCalculator(EmployeeName, basicSalary);
		obj.displaySalaryDetails();
		
	}

}
