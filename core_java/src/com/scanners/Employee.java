package com.scanners;

public class Employee {
		 int empId;
		 String name;
		 String designation;
		 double salary;
		 int performanceRating;
		
		public Employee(int empId, String name, String designation, double salary, int performanceRating) {
			this.empId= empId;
			this.name= name;
			this.designation= designation;
			this.salary= salary;
			this.performanceRating= performanceRating;
		}
		public int getEmpId() {
			return empId;
		}
		public String getName() {
			return name;
		}
		public String getDesignation() {
			return designation;
		}
		public double getSalary() {
			return salary;
		}
		public int getPerformanceRating() {
			return performanceRating;
		}
		
	
		public void setDesignation(String designation) {
			this.designation= designation;
		}
		public void setSalary(double salary) {
			this.salary= salary;
		}
		public void promoteEmployee() {
			if(performanceRating >= 4) {
				salary= salary + (salary*20/100);
				System.out.println("after promotion");
				System.out.println("updated salary :" + salary);
				System.out.println("Designation : SD");
		 	    System.out.println("promote to next level");
			}
			else {
				System.out.println("No promotion");
			}
		}
		
	

	}


