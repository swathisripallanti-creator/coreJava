package com.thisKey;

public class Mobile {
		String brand;
		String model;
		double price;
		
		public void setMobileDetails(String brand, String model, double price) {
			this.brand=brand;
			this.model=model;
			this.price=price;
		}
		public void displayMobileDetails() {
			System.out.println("Mobile Details");
			System.out.println("-------------------");
			System.out.println("Mobile brand : " + brand);
			System.out.println("Mobile model : " + model);
			System.out.println("Mobile price : " + price);
		}
		
	}


