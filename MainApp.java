package com.edu;

class Shape{
	void area()
{
	System.out.println("Area of Shape");
}
}

class Rectangle extends Shape{
	int l,b,a;
	
	void area() {
		l=3;
		b=4;
		a=l*b;
		System.out.println("Area of Rectangle is :"+a);
	}
}

class Square extends Shape{
	int s,a;
	void area(){
	s=8;
	a=s*s;
	System.out.println("Area of Square is :"+a);
		
	}
}
public class MainApp {

	public static void main(String[] args) {
		Rectangle rob= new Rectangle();
		rob.area();
		
		Square sob =new Square();
		sob.area();
		//Dynamically Dispatch
		Shape sobj;
		sobj =new Rectangle();
		sobj.area();
		sobj=new Square();
		sobj.area();
	}

}
