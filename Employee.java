package com.object;

public class Employee {
	int empId = 1;
	String empName = "Sakshi";
	String empDesignation = " Jr Java Developer";
	
	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println("Employee Id "+e.empId+"\nEmployee Name :"+e.empName+"\nEmployee Desgination : "+e.empDesignation);

	}

}
