package com.datatypes;

public class school {
	public static String schoolName;
	String studentName;
	int rollNo;
	int marks;
	
	void display() {
		System.out.println("schoolName:"+schoolName);
		System.out.println("studentName:"+studentName);
		System.out.println("rollNo:"+rollNo);
		System.out.println("marks:"+marks);
		System.out.println("------------");
	}
	

	public static void main(String[] args) {
		school obj1=new school();
		
		obj1.schoolName="pavan";
		obj1.studentName="pavan";
		obj1.rollNo=21;
		obj1.marks=97;
		
		
		obj1.display();
		
		
		

	}

}
