package Inheritance;

public class Laptop extends Computer{
	public void showModel() {
		System.out.println("Model : XPS 15");
	}
	public static void main(String[] args) {
		Laptop obj=new Laptop();
		obj.showBrand();
		obj.showModel();
	}

}
