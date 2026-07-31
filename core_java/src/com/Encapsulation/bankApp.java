package com.Encapsulation;

public class bankApp {

	public static void main(String[] args) {
		bankAccount obj=new bankAccount();
		
		System.out.println("Bank Account Details");
		System.out.println("-----------------------");
		
		obj.setaccountNumber(101);
		obj.setaccountName("swathi");
		obj.setbalance(4000.00);
		
		System.out.println("Account Number : " + obj.getaccountNumber());
		System.out.println("Account Holder : " + obj.getacountName());
		System.out.println("Balance : " + obj.getbalance());
	}

}
