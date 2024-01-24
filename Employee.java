package com.edu;

import java.util.Scanner;

public class Employee {
int eid;
String ename;
float esalary;
public Employee() {
	System.out.println("no argument");
}

public Employee(int eid,String ename,float esalary) {
	this.eid=eid;
	this.ename=ename;
	this.esalary=esalary;
}
void inputData() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your id:");
	eid=sc.nextInt();
	
	System.out.println("Enter your Name:");
	ename=sc.next();
	
	System.out.println("Enter your Salary:");
	esalary= sc.nextFloat();
}
void display() {
	System.out.println("Id = "+eid);
	System.out.println("Name = "+ename);
	System.out.println("Salary = "+esalary);
}
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.inputData();
		e1.display();
		
		int a[]=new int[5];
		
		Employee emp[]=new Employee[5];
		
		emp[0]=new Employee(1,"Manoj",34567);
		emp[1]=new Employee(2,"Sakshi",999999);
		emp[2]=new Employee(3,"Kedar",564778);
		emp[0].display();
		emp[1].display();
		emp[2].display();
	}

}
