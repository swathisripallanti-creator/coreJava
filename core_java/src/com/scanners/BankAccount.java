package com.scanners;

//BLC - Business Logic Class
class BankAccount {
 private int accountNumber;
 private String accountHolder;
 private double balance;

 // Parameterized Constructor
 public BankAccount(int accountNumber, String accountHolder, double balance) {
     this.accountNumber = accountNumber;
     this.accountHolder = accountHolder;
     this.balance = balance;
 }

 // Getter Methods
 public int getAccountNumber() {
     return accountNumber;
 }

 public String getAccountHolder() {
     return accountHolder;
 }

 public double getBalance() {
     return balance;
 }

 // Setter Method
 public void setBalance(double balance) {
     this.balance = balance;
 }

 // Deposit Method
 public void deposit(double amount) {
     balance = balance + amount;
     System.out.println("Deposited: " + amount);
 }

 // Withdraw Method
 public void withdraw(double amount) {
     if (balance >= amount) {
         balance = balance - amount;
         System.out.println("Withdrawn: " + amount);
     } else {
         System.out.println("Insufficient balance");
     }
 }
}