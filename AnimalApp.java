package com.edu;
/*
 * Write a Java program to 
 * create a Animal interface with
 *  a method called bark() that takes
 *  no arguments and returns void.
 *   Create a Dog class that implements Animal 
 *   and overrides speak() to print 
 *   "Dog is barking"*/
interface Animal{
	void bark();
}
class Dog implements Animal{
	public void bark() {
		System.out.println("Dog is Barking");
	}
}
public class AnimalApp {

	public static void main(String[] args) {
		Dog aob = new Dog();
		aob.bark();

	}

}
