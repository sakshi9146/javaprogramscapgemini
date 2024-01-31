package com.edu;

interface Calculator{
	void add();
	void Sub();
	//java 8
	default void diaplay(){
		System.out.println("default method java 8 feature of interface");
		}
	//java 9
	static void staticmethod() {
		System.out.println("static method in java 9");
	}
}
class MyCalculator implements Calculator{
	public void add(){
		System.out.println("add method");
	}
	
	public void Sub() {
		System.out.println("sub method");
	}

	
}
public class MainAppInterface {

	public static void main(String[] args) {
		MyCalculator moc= new MyCalculator();
		moc.add();
		moc.Sub();
		moc.diaplay();
		Calculator.staticmethod(); //call static method of interface

	}

}
