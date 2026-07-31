package com.blcelc;

public class Student {
	String studentName;
	int javaMarks;
	int sqlMarks;
	int webMarks;
	
	public Student(String studentName, int javaMarks, int sqlMarks, int webMarks) {
	this.studentName=studentName;
	this.javaMarks=javaMarks;
	this.sqlMarks=sqlMarks;
	this.webMarks=webMarks;
	
	
	}
	
	public int calculateTotal() {
		return javaMarks + sqlMarks + webMarks;
	}
	public double calculatePercentage() {
		return calculateTotal()/3;
	}
	public void displayStudentDetails() {
		System.out.println("Student Details");
		System.out.println("--------------------");
		System.out.println("Name : " + studentName);
		System.out.println("Total : " + calculateTotal());
		System.out.println("Percentage : " + calculatePercentage() + "%");
		
	}
}
