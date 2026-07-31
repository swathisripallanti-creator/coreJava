package com.blcelc;
import java.util.Scanner;
public class RectangleApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter length : ");
		int length=sc.nextInt();
		
		System.out.println("Enter breadth : ");
		int breadth=sc.nextInt();
		
		Rectangle obj=new Rectangle(length, breadth);
		obj.displayRectangleDetails();
		
		}
	}


