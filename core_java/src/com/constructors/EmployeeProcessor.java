package com.constructors;

public class EmployeeProcessor {

	public static void main(String[] args) {
		Employee emp= new Employee(96,"swathi", "JD", 80000, 4);
		System.out.println("Before promotion");
		System.out.println("ID : " + emp.getEmpId());
		System.out.println("Name : " + emp.getName());
		System.out.println("Designation : " + emp.getDesignation());
		System.out.println("Salary : " + emp.getSalary());
		System.out.println("PerformanceRating : " + emp.getPerformanceRating());
		
		emp.promoteEmployee();
		System.out.println("------------------");
		System.out.println("After promotion");
		System.out.println("NewDesignation : " + emp.getDesignation());
		System.out.println("Salary : " + emp.getSalary());
		
		
		
	}

}
