package com.methods;

public class student {
	public static String collegename;
	String studentName;
	int student_id;
	
	public static void collegeinfo() {
		System.out.println("collegename:"+collegename);
		
	}
	
	void studentinfo() {
		System.out.println("studentname:"+studentName);
		System.out.println("studentid:"+student_id);
		
		
	}

	public static void main(String[] args) {
		student obj1=new student();
		obj1.collegename="10k coders";
		obj1.studentName="swathi";
		obj1.student_id=101;
		
		obj1.collegeinfo();
		obj1.studentinfo();
		
	}

}
