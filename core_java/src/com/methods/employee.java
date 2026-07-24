package com.methods;

public class employee {
	static String companyname;
	int employeeid;
	String employeeName;
	
	static void companyinfo() {
		System.out.println("companyname:"+companyname);
	}
	void employeeinfo() {
		System.out.println("employeeid:"+employeeid);
		System.out.println("employeeName:"+employeeName);
		
	}

	public static void main(String[] args) {
		employee obj1=new employee();
		
		obj1.companyname="Infosys";
		obj1.employeeid=1001;
		obj1.employeeName="Ram";
		
		obj1.companyinfo();
		obj1.employeeinfo();
		

	}

}
