package com.scanners;
import java.util.Scanner;
public class EmployeeProcessor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter empID :");
		int id=sc.nextInt();
		System.out.println(id);
		
		System.out.println("Enter empName :");
		String name=sc.next();
		System.out.println(name);
		
		System.out.println("Enter empDesg :");
		String desg=sc.next();
		System.out.println(desg);
		
		System.out.println("Enter empsal :");
		double sal=sc.nextDouble();
		System.out.println(sal);
		
		System.out.println("Rating :");
		int rating=sc.nextInt();
		System.out.println(rating);
		
		
		Employee emp= new Employee(id, name, desg, sal, rating);
		System.out.println("------------------");
		
		System.out.println("promote Employee");
		
	   emp.promoteEmployee();
		
		
		
		
	}

}
