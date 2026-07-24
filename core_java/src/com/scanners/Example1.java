package com.scanners;
import java.util.Scanner;
public class Example1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name= sc.nextLine();
	    System.out.println(name);
	    System.out.println("--------------------");
	    System.out.println("Enter your age");
	    int age=sc.nextInt();
	    System.out.println(age);
	    System.out.println("--------------------");
	    
	    
	    
	     System.out.println("Enter your course");
	    String course= sc.next();
	    System.out.println(course);
	    System.out.println("--------------------");
	    System.out.println("Enter your collegename");
	    String college= sc.next(); 
	    System.out.println(college);
	    }
	
	
}
