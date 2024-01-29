package com.edu;
//Multilevel Inheritance
class Parent{
	Parent(){
		System.out.println("Parent constructor");
	}
}

class Child1 extends Parent{
	Child1(){
		System.out.println("Child1 Constructor");
	}
}
class Child2 extends Child1{
	Child2(){
		System.out.println("Child2 Constructor");
	}
}
public class MainAppConstr {

	public static void main(String[] args) {
		Child2 cob = new Child2();

	}

}
