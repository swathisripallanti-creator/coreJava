package Inheritance;

public class Car extends Vehicle {
	
	
	public void speed() {
		System.out.println("Car is moving at 80km/h");
	}
	
	
	
	public static void main(String[] args) {
		
		Car obj=new Car();
		obj.run();
		obj.speed();
	}

}
