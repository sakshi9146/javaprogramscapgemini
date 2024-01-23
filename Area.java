package com.object;

import java.util.Scanner;

public class Area {
	int length,breadth;
// if we pass same variable name in the class and constructor then compiler will get confuse 	
//This can be solved by Changing the variable name or we can use this keyword.	
	public  Area(int l,int b) {
		length = l;
		breadth = b;
	}
	public void getArea() {
		System.out.println("Area of Reactangle is :"+length*breadth);
	}
	public static void main(String[] args) {
		int l=0,b=0;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the Length: ");
		l=sc.nextInt();
		
		System.out.println("Enter the Breadth: ");
		b=sc.nextInt();
		
		Area a = new Area(l,b);
		a.getArea();
	}

}
