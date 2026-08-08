package com.scanners;
import java.util.Scanner;
public class studentDetails {
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Student Id : ");
		int studentId=sc.nextInt();
		
		System.out.println("Enter student Name : ");
		String studentName=sc.next();
		
		System.out.println("Enter age : ");
		int age=sc.nextInt();
		
		System.out.println("Enter course : ");
		String course=sc.next();
		
		System.out.println("Student Details");
		System.out.println("--------------------");
		
		System.out.println("Student id : " + studentId);
		System.out.println("Student Name : " + studentName);
		System.out.println("Age : " + age);
		System.out.println("Course : " + course);
	}
	
	
	

}
