package com.blcelc;

public class Rectangle {
	int length;
	int breadth;
	
	public Rectangle(int length, int breadth) {
		this.length=length;
		this.breadth=breadth;
		
	}
		public int calculateArea() {
			return length * breadth;
		}
		
		public int calculatePerimeter() {
			return 2 * (length + breadth);
		}
		
		public void displayRectangleDetails() {
			System.out.println("Rectangle Details");
			System.out.println("--------------------");
			System.out.println("Length : " + length);
			System.out.println("Breadth : " + breadth);
			System.out.println("Area : " + calculateArea());
			System.out.println("Perimeter : " + calculatePerimeter());
			
		}
		
		
	
}
