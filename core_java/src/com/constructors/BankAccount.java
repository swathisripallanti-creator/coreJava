package com.constructors;

public class BankAccount {
	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	public BankAccount(int accountNumber, String accountHolder, double balance) {
		this.accountNumber= accountNumber;
		this.accountHolder= accountHolder;
		this.balance= balance;
		
		}
			public int getAccountNumber() {
				return accountNumber;
	}
			public String getAccountHolder() {
				return accountHolder;
			}
			public double getbalance() {
				return balance;
			}
			
		  public void setBalance(double balance) {
			  this.balance= balance;
		  }
		  public void deposit(double amount) {
			  balance = balance + amount;
			  System.out.println("Amount deposit : " + amount); 
			  System.out.println("Amount deposited");
		  }
		  public void withdraw(double amount) {
			  if(balance >= amount){
			  balance = balance - amount;
			  System.out.println("Amount withdraw : " + amount);
			  System.out.println("Amount withdraw");
		  } else {
			  System.out.println("insufficient balance");
		  }
		  }
}
