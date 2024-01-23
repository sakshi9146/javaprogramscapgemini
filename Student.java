package com.object;



//Assign and print the roll number, 
//phone number and address of two students having names "Sam" and "John"
//respectively by creating two objects of class 'Student'.
public class Student {
	String name;
	int roll;
	int phoneNumber;
  void show(String name,int roll,int phoneNumber) {
	
	System.out.println("Enter your Name :"+name);
	
	System.out.println("Enter your Roll Number  :"+roll);
	System.out.println("Enter your Phone Number  :"+phoneNumber);
 }
 
	public static void main(String[] args) {
		Student s1 = new Student ();
		s1.show("sam",101,987654456);
		s1.show("John", 102, 9786765);
	}

}
