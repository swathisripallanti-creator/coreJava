package com.blcelc;

public class Employee {
      int employeeId;
      String employeeName;
      double salary;
      
      public int getId() {
    	  return employeeId;
      }
      public String getName() {
    	  return employeeName;
      }
      public double getSalary() {
    	  return salary;
      }
      public void setId(int id) {
    	  employeeId=id;
      }
      public void setName(String name) {
    	  employeeName=name;
      }
      public void setSalary(double sal) {
    	  salary=sal;
      }
      
	public static void main(String[] args) {
      
	}

}
