package StudentManagementSystem;

public class StudentResult {
	String studentName;
	int studentId;
	String courseName;
	double totalMarks;
	
	public StudentResult(String studentName, int studentId, String courseName, double totalMarks) {
		this.studentName=studentName;
		this.studentId=studentId;
		this.courseName=courseName;
		this.totalMarks=totalMarks;
		
		System.out.println("Student Records Created successfully");
	}
	
	void addMarks(double marks) {
		totalMarks += marks;
		System.out.println("Marks Updates Successfully");
		
		if(marks <= 0) {
			System.out.println("Invalid marks entered");
		}
	}
		public void calculateGrade() {
			if( totalMarks >= 90) {
				System.out.println("Grade A" );
				
			}
			else if((totalMarks <90) && (totalMarks >=80)) {
				System.out.println("Grade B");
			}
			else if((totalMarks <80 )&& (totalMarks >=70)) {
				System.out.println("Grade C");
			}
			else if((totalMarks <70)&&(totalMarks >=60)) {
				System.out.println("Grade D");
			}
			else if(totalMarks < 60) {
			
				System.out.println("Fail");
			}
			else {
				System.out.println("No marks available to calculate grade");
			}
			
			
			}
		public void displayDetails() {
			System.out.println("Total marks : " + totalMarks);
		}
		
		}
			
		
	

