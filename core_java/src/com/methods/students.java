package com.methods;

public class students {
	void calculatepercentage() {
		int sub1=31;
		int sub2=73;
		int sub3=87;
		int sub4=87;
		int sub5=43;
		
		int total=sub1+sub2+sub3+sub4+sub5;
	  double percentage=total/5.0;
	  
	  System.out.println("student percentage report");
	  System.out.println("total marks:"+total);
	  System.out.println("percentage:"+percentage+"%");
		
		
	}
	

	public static void main(String[] args) {
		students obj1=new students();
		
		obj1.calculatepercentage();
		

	}

}
