package com.Encapsulation;

public class Student {
	private int studentId;
	private String studentName;
	private String course;
	private double percentage; 
	
	
	public int getstudentId() {
		return studentId;
	}
	public String getstudentName() {
		return studentName;
	}
	public String getcourse() {
		return course;
	}
	public double getpercentage() {
		return percentage;
	}
	public void setstudentId(int studentId) {
		this.studentId=studentId;
	}
	public void setstudentName(String studentName) {
		this.studentName=studentName;
	}
	public void setcourse(String course) {
		this.course=course;
	}
	public void setpercentage(double percentage) {
		this.percentage=percentage;
	}
}
