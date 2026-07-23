package com.blcelc;

public class BankAccount {
     long accountNumber;
     String accountName;
     double balance;
     
     public long getNumber() {
    	 return accountNumber;
     }
     public String getName() {
    	 return accountName;
     }
     public double getBalance() {
    	 return balance;
     }
     public void setNumber(long Number) {
    	 accountNumber=Number;
     }
     public void setName(String Name) {
    	 accountName=Name;
     }
     public void setBalance(double Balance) {
    	 balance=Balance;
     }
     public String displayDetails(){
 		return "accountNumber :" + getNumber() + "\naccountName :"+ getName() + "\nbalance :"+ getBalance();
 	} 
 
	public static void main(String[] args) {
        
	}
	
}
