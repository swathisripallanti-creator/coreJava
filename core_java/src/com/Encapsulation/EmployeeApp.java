package com.Encapsulation;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee emp=new Employee();
		
		System.out.println("Employee Details");
		System.out.println("-------------------");
		
		emp.setEmployeeId(101);
		emp.setEmployeeName("swathi");
		emp.setdepartment("java ");
		emp.setSalary(60000.00);
		
		System.out.println("Employee Id : " + emp.getEmployeeId());
		System.out.println("Employee Name : " + emp.getEmployeeName() );
		System.out.println("Department : " + emp.getdepartment());
		System.out.println("Salary : " + emp.getSalary());
	}

}
