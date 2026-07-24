package com.methods;

public class interest {
	void calculateSI() {
		
		int principal=10000;
		int rate=5;
		int time=2;
		
		int interest=(principal*rate*time)/100;
		
		System.out.println("simple interest details");
		System.out.println("principal:"+principal);
		System.out.println("rate:"+rate);
		System.out.println("time:"+time);
		
		System.out.println("interest:"+interest);
	}

	public static void main(String[] args) {
		interest get=new interest();
		get.calculateSI();

	}

}
