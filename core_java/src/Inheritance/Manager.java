package Inheritance;
import java.util.Scanner;
public class Manager extends Employee{
	int bonus=20000;
	
	public void displaytotalSalary() {
		
		int totalSalary = Salary + bonus;
		System.out.println("Employee Salary Details ");
		System.out.println("-------------------------");
		System.out.println("Salary : " + Salary);
		System.out.println("bonus : " + bonus);
		System.out.println("totalSalary : " + (Salary + bonus));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter salary :");
		int Salary= sc.nextInt();
		
		System.out.println("Enter bonus : ");
		int bonus=sc.nextInt();
		
		
		Manager obj=new Manager();
		obj.displaytotalSalary();
		
	}

}
