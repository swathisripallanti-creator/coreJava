package com.blcelc;

public class BankApplication {

	public static void main(String[] args) {
       BankAccount obj=new BankAccount();
       obj.setNumber(938745714);
       obj.setName("swathi");
       obj.setBalance(50000.0);
       System.out.println(obj.getNumber());
       System.out.println(obj.getName());
       System.out.println(obj.getBalance());
       System.out.println(obj.displayDetails());
       
	}

}
