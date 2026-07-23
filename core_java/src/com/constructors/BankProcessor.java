package com.constructors;

public class BankProcessor {

	public static void main(String[] args) {
		BankAccount obj= new BankAccount(986458, "swathi", 80000);
		System.out.println("Current balance");
		System.out.println("AccountNumber : " + obj.getAccountNumber());
		System.out.println("AccountHolder : " + obj.getAccountHolder());
		System.out.println("Balance : " + obj.getbalance());
		obj.withdraw(20000);
		
		System.out.println("----------------");
		System.out.println("Updated balance : " + obj.getbalance());
		
	}

}
