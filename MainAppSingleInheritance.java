package com.edu;

import java.util.Scanner;

//Is-A relation (Single inheritance)
class Address{
	int dono;
	String street;
	int pincode;
	
	void inputAddress() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter door no");
		dono=sc.nextInt();
		
		System.out.println("Enter Street ");
		street = sc.next();
		
		System.out.println("Enter pincode");
		pincode = sc.nextInt();
	}
	
}

class Employee extends Address{//Single Inheritance 
	int eid;
	String employeeName;
	Address aob;
	Employee(){
		
	}
	void inputEmpData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		eid=sc.nextInt();
		
		System.out.println("Enter employee name");
		employeeName=sc.next();
		inputAddress();
		
		
	}
	
	void displayEmp() {
		System.out.println("Employee Details");
		System.out.println("Name :"+employeeName);
		System.out.println("ID :"+eid);
		
		System.out.println("Employee address :");
		System.out.println("Door No :"+dono);
		System.out.println("Street :"+street);
		System.out.println("Pincode :"+pincode);
	}
}

public class MainAppSingleInheritance {

	public static void main(String[] args) {
		Employee eob = new Employee();
		eob.inputEmpData();
		eob.displayEmp();
	}

}
