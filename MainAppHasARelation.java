package com.edu;

import java.util.Scanner;

//Has-A-Relation (having an object into another class
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

class Employee{
	int eid;
	String employeeName;
	Address aob;
	Employee(){
		aob = new Address();
	}
	void inputEmpData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		eid=sc.nextInt();
		
		System.out.println("Enter employee name");
		employeeName=sc.next();
		
		
		aob.inputAddress();
	}
	
	void displayEmp() {
		System.out.println("Employee Details");
		System.out.println("Name :"+employeeName);
		System.out.println("ID :"+eid);
		
		System.out.println("Employee address :");
		System.out.println("Door No :"+aob.dono);
		System.out.println("Street :"+aob.street);
		System.out.println("Pincode :"+aob.pincode);
	}
}


public class MainAppHasARelation {

	public static void main(String[] args) {
		Employee eobj = new Employee();
		eobj.inputEmpData();
        eobj.displayEmp();
	}

}
