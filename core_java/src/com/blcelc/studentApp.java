package com.blcelc;
import java.util.Scanner;
public class studentApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student Name : ");
		String studentName=sc.next();
		
		System.out.println("Enter Java Marks : ");
		int javaMarks=sc.nextInt();
		
		System.out.println("Enter sql Marks : ");
		int sqlMarks=sc.nextInt();
		
		System.out.println("Enter web Marks : ");
		int webMarks=sc.nextInt();
		
		Student obj=new Student(studentName, javaMarks, sqlMarks, webMarks);
		obj.displayStudentDetails();
	}

}
