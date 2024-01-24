package com.edu;

public class Student {//user defined data type
	//Instance Variable
		int sid;
		String sname;
		float sfees;
public Student() {//no argument constructor
	sid=4;
	sname="kiran";
	sfees=874;
}
public Student(int sid,String sname,float sfees) {
	
	System.out.println("constructor with Argument"+this);
	this.sid=sid;
	this.sname = sname;
	this.sfees=sfees;
}
	public static void main(String[] args) {
		Student sob = new Student();
		Student sob1= new Student(5,"Sakshi",100);
		System.out.println("id="+sob.sid);
		System.out.println("Name="+sob.sname);
		System.out.println("Fees="+sob.sfees);
//local variables need to be initialized
//Instance variables get the default values 
		System.out.println("id="+sob1.sid);
		System.out.println("Name="+sob1.sname);
		System.out.println("Fees="+sob1.sfees);
		System.out.println("sob1="+sob1);
	}

}
