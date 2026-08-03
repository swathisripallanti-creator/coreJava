package com.datatypes;

public class Employee {
	public static String company;
	public static String location;
	String empName;
	int empid;
	
	void display() {
		System.out.println("company name:"+company);
		System.out.println("company location:"+location);
		System.out.println("employee name:"+empName);
		System.out.println("employee id:"+empid);
		System.out.println("-------------");
	}
			
	public static void main(String[] args) {
		Employee get1=new Employee();
		Employee get2=new Employee();
		
		get1.company="infosys";
		get1.location="hyderabad";
		get1.empName="swathi";
		get1.empid=101;
		
		
		
		get1.display();
		
	}

}
