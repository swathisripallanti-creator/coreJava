package BankApplication;

public class BankAccount {
	public String bankName;
	private double balance;
	protected String branchName;
	 int accountNumber;
	 
	public void displayDetails() {
		System.out.println("bankName :" + bankName);
		System.out.println("balance :" + balance);
		System.out.println("branchName :" + branchName);
		System.out.println("accountNumber :" + accountNumber);
	}
	 
	public static void main(String[] args) {
		BankAccount obj=new BankAccount();
		 obj.bankName="SBI";
		 obj.balance=800000;
		 obj.branchName="hyd";
		 obj.accountNumber=87654;
		
		
		obj.displayDetails();
		
		
		
		
		}
		
		
	}


