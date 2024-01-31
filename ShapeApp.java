package com.edu;
/*Write a Java program to create an interface 
Shape with the getArea() method. 
Create three classes Rectangle, Circle, and
Triangle that implement the Shape interface. 
Implement the getArea() method for each of
the three classes.*/
interface Shape{
	void getArea();
}
class Rectangle implements Shape{
	public void getArea() {
		int l=10;
		int b=2;
		int a=l*b;
		System.out.println("Area Of Rectangle is "+a);
	}
}
class Circle implements Shape{
	public void getArea() {
		int r=2;
		double a= 3.14*r*r;
		System.out.println("Area Of Circle is "+a);
	}
}

class Triangle implements Shape{
	public void getArea() {
		int h =10;
		int b= 5;
		int a= (h*b)/2;
		System.out.println("Area of Traingle is "+a);
	}
}
public class ShapeApp {

	public static void main(String[] args) {
		Rectangle rob = new Rectangle();
		rob.getArea();
		Circle coc = new Circle();
		coc.getArea();
		Triangle toc = new Triangle();
		toc.getArea();

	}

}
