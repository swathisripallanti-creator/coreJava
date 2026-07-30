package StudentManagementSystem;
import java.util.Scanner;
public class StudentDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Student Name :");
		String studentName=sc.next();
		
		System.out.println("Student Id :");
		int studentId=sc.nextInt();
		
		System.out.println("Course Name :");
		String course=sc.next();
		
		System.out.println("First subject marks :");
		int FirstSubjectMarks=sc.nextInt();
		
		StudentResult obj = new StudentResult(studentName, studentId, course, FirstSubjectMarks);
		
		
		int choice;
		
		do {
			
			System.out.println("Student Result Menu");
			System.out.println("------------------------");
			System.out.println("\n1. Add more subject marks");
			System.out.println("\n2. Calculate grade");
			System.out.println("\n3. View total marks");
			System.out.println("\n4. Exit");
			System.out.println("\n Enter your choice : ");
			
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: 
				System.out.println("Enter Marks");
				double Marks=sc.nextDouble();
				obj.addMarks(Marks);
				break;
				
			case 2:
				obj.calculateGrade();
				break;
				
			case 3:
				obj.displayDetails();
				break;
				
			case 4:
				System.out.println("Thank you Result Processing Completed.");
				break;
				default :
					System.out.println("Invalid option");
			}
			
		} while(choice !=4);
		sc.close();
		
	}
	
	
}
	
	
