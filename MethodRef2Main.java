package com.edu.java8features;

interface Add{
	void addition();
}
interface Sub{
	void substraction();
	
}

public class MethodRef2Main {
	public static void additionMethod() {
		int i=20;
		int j=40;
		int s=i+j;
		System.out.println("sum="+s);
	}

	public static void subMethod() {
		int i=600;
		int j=40;
		int sub=i+j;
		System.out.println("sum="+sub);
	}
	

	public static void main(String[] args) {
		
		//MethodRef2Main.additionMethod();
		
		Add aob=MethodRef2Main::additionMethod;
		aob.addition();
		
		Sub s = MethodRef2Main::subMethod;
		s.substraction();
	}

}
