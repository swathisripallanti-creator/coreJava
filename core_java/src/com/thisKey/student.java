package com.thisKey;

public class student {
	int studentId;
	String studentName;
	String course;
	
	public void setDetails(int studentId, String studentName, String course) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.course=course;
	}
	
	public void displayDetails() {
		
		System.out.println("Student Details");
		System.out.println("---------------------");
		System.out.println("Student Id : " + studentId);
		System.out.println("Student Name : " + studentName);
		System.out.println("Course : " + course);
		
	}

	

}


