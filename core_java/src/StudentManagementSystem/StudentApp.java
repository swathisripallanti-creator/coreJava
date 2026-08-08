package StudentManagementSystem; 

public class StudentApp {

	public static void main(String[] args) {
		Student obj=new Student();
		
		System.out.println("Student Details");
		System.out.println("--------------------");
		
		obj.setstudentId(101);
		obj.setstudentName("swathi");
		obj.setcourse("java");
		obj.setpercentage(97.00);
		
		System.out.println("Student Id : " + obj.getstudentId());
		System.out.println("Student Name : " + obj.getstudentName());
		System.out.println("Course : " + obj.getcourse());
		System.out.println("Percentage : " + obj.getpercentage());
		
		
		
	}

}
