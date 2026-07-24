package com.methods;

public class std {
	int  sub1, sub2, sub3,sub4,sub5;
   void calculatePercentage() {
	    sub1=32;
	    sub2=65;
	    sub3=76;
	    sub4=87;
	    sub5=98;
	   
   
   
   int total=(sub1+sub2+sub3+sub4+sub5);
   double percentage=total/5.0;
   System.out.println("student percentage calculator");
   System.out.println("total marks :"+ total);
   System.out.println("percentage :"+ percentage);
  


}
   
	public static void main(String[] args) {
		std s=new std();
     s.calculatePercentage();
	}

}
