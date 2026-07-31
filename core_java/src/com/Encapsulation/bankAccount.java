package com.Encapsulation;

public class bankAccount {
	private int accountNumber;
	private String accountName;
	private double balance;
	
	public int getaccountNumber() {
		return accountNumber;
	}
	public String getacountName() {
		return accountName;
	}
	public double getbalance() {
		return balance;
	}
	
	public void setaccountNumber(int accountNumber) {
		this.accountNumber=accountNumber;
	}
	public void setaccountName(String accountName) {
		this.accountName=accountName;
	}
	public void setbalance(double balance) {
		this.balance=balance;
	}
}
