package com.methods;

public class calculatebill {
 void calculatebill() {
	 int units=250;
	 int cost_per_unit=8;
	 
	int total = (units*cost_per_unit);
	System.out.println("electricity bill");
	System.out.println("units:"+units);
	System.out.println("cost per unit:"+cost_per_unit);
	System.out.println(total);
 }
	
	
	
	
	public static void main(String[] args) {

		calculatebill get = new calculatebill();
		get.calculatebill();
	}

}
