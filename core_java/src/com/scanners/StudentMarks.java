package com.scanners;
import java.util.Scanner;
public class StudentMarks {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Java Marks : ");
		int javaMarks=sc.nextInt();
		
		System.out.println("Enter SQL Marks : ");
		int SqlMarks=sc.nextInt();
		
		System.out.println("Enter HTML Marks : ");
		int HTMLMarks=sc.nextInt();
		
		System.out.println("Enter CSS Marks : ");
		int CssMarks=sc.nextInt();
		
		System.out.println("Enter JavaScript Marks : ");
		int JavaScript=sc.nextInt();
		
		int totalMarks= javaMarks + SqlMarks + HTMLMarks + CssMarks + JavaScript;
		double Average = totalMarks/5;
		double percentage= (totalMarks/500.0)*100;
		
		System.out.println("Total Marks : " + totalMarks);
		System.out.println("Average : " + Average);
		System.out.println("percentage : " + percentage+"%");
	}

}
