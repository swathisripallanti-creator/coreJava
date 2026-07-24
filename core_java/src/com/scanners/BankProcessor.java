package com.scanners;
import java.util.Scanner;
public class BankProcessor { 
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your AccountNumber : ");
		int num=sc.nextInt();
		System.out.println("Enter HolderName :");
		String name=sc.next();
		System.out.println("Account Balance :");
		double balance=sc.nextDouble();
		
		BankAccount obj= new BankAccount(num, name, balance);
		
		
		
		
		
		System.out.println("----------------");
		
		System.out.println("deposit amount :");
		double deposit=sc.nextDouble();
		obj.deposit(deposit);
		
		System.out.println("----------------");
		System.out.println("withdraw amount :");
		double withdraw=sc.nextDouble();
		obj.withdraw(withdraw);
		System.out.println("----------------");
		System.out.println("Updated balance : " + obj.getBalance());
		
	}

}
