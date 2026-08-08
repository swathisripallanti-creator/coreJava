package com.scanners;
import java.util.Scanner;
public class EmployeeDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee Id : ");
		int EmployeeId=sc.nextInt();
		
		System.out.println("Enter Employee Name : ");
		String EmployeeName=sc.next();
		
		System.out.println("Enter Employee basic salary : ");
		double BasicSalary=sc.nextDouble();
		
		double hra= BasicSalary * 20/100;
		double da= BasicSalary * 10/100;
		double GrossSalary= BasicSalary + hra + da;
		
		
		System.out.println("Employee Details ");
		System.out.println("--------------------");
		
		System.out.println("Employee id : " + EmployeeId);
		System.out.println("Employee Name : " + EmployeeName);
		System.out.println("Basic salary : " + BasicSalary);
		System.out.println("Gross salary : " + GrossSalary);
		
	}
	

}
