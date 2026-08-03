package com.datatypes;

public class example1 {
 public static int sum;
 public static int sub;
 public static int mul;
 public static int div;
 
  void display(){
	  System.out.println("Addition of 10 and 20="+sum);
	  System.out.println("subraction of 20 from 30="+sub);
	  System.out.println("multiplication of 10 and 20="+mul);
	  System.out.println("division of 20 by 10="+div);
	  System.out.println("-----------");
  }
  void displays(){
	  System.out.println("Addition of 40 and 60="+sum);
	  System.out.println("subraction of 80 from 120="+sub);
	  System.out.println("multiplication of 60 and 1="+mul);
	  System.out.println("division of 1 by 1="+div);
	  System.out.println("-----------");
  }



public static void main(String[] args) {
	example1 obj1=new example1();
	example1 obj2=new example1();
	
	obj1.sum=10+20;
	obj1.sub=20-30;
	obj1.mul=10*20;
	obj1.div=20/10;

	
	obj1.display();
	
	
	obj2.sum=40+60;
	obj2.sub=80-120;
	obj2.mul=60*1;
	obj2.div=1/1;
	
	obj2.displays();
		

	}

}
