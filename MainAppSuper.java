package com.edu;
//object is root class
class ParentClass{
	private int cardno;
	public ParentClass(){
		System.out.println("Parent Class Constructor");
		
	}
	public ParentClass(int cardno) {
		super();
		this.cardno = cardno;
		System.out.println("Card no is :"+cardno);
	}
	void parentDisplay() {
		System.out.println("parent Method");
	}
	
}

class ChildClass extends ParentClass{
	public ChildClass() {
		super();//super() should be 1st statement in child class Constructor
		System.out.println("Child Class Constructor");
		
	}
	public ChildClass(int cn) {
		super(cn);//explicit calling
	}
	void parentDisplay() {
		
		System.out.println("Child class Display");
		super.parentDisplay();// method overriden should be any where.
	}
	
}

public class MainAppSuper {

	public static void main(String[] args) {
		ChildClass cob = new ChildClass();
		ChildClass cob1 = new ChildClass(11223344);
		cob.parentDisplay();
	}

}
