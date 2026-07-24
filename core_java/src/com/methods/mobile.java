package com.methods;

public class mobile {
	public static String brand;
	String model;
	int price;
	
	static void brandinfo() {
		System.out.println("brand:"+brand);
	}
    void mobileinfo() {
    	System.out.println("model:"+model);
    	System.out.println("price:"+price);
    }
	public static void main(String[] args) {
		mobile obj1=new mobile();
		obj1.brand="samsung";
		obj1.model="s24";
		obj1.price=80000;
		
		obj1.brandinfo();
		obj1.mobileinfo();
		
		

	}

}
