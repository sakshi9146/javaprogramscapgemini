package com.object;

public class Animal {
	
	String name;
	int age;
	
	//Default constructor
	public Animal() {
		System.out.println("This is Default Constructor");
	}
	//parameterized Constructor
	public Animal(String name,int age) {
		System.out.println(name+" "+age);
	}
	public static void main(String[] args) {
		Animal a = new Animal();
		Animal a1 = new Animal("tommy", 12);

	}

}
