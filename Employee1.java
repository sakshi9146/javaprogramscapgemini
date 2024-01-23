package com.object;

public class Employee1 {
	

	int empId;
	
	String empName;
	
	String empDesignation;
	
	void show(int empId, String empName,String empDesignation )
	{
		
	System.out.println("Employee Id:"+empId+"\nEmployee  Name:"
	+empName+"\nEmployee Designation: "+empDesignation);
	}
	public static void main(String[] args) {
		
		Employee1 e2=new Employee1();
		e2.show(101, "Ajay", "Tester");
		e2.show(102, "Sweety", "Hacker");
		e2.show(103, "Shyam", "Java Developer");
	
//without Creating multiple objects we can input multiple data from user by using method

	

	}

}
