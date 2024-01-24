package com.edu;

public class MainAppFunctionOverload {
//functions overloading can  be done in 3 ways
	//1.Based on data type 
	//2.Based on number of Arguments
	//3.interchanging the argument
	
	void add(int i,int j) {
		int s=i+j;
		System.out.println("Sum of int ="+s);
	}
	void add(float i,float j) {
		float s= i+j;
		System.out.println("Float sum= "+s);
	}
	void add(double i,double j) {
		double s= i+j;
		System.out.println("double sum= "+s);
	}
	void add(short i,short j) {
		short s= (short)(i+j);
		System.out.println("short sum="+s);
	}
	void add(long i,long j) {
		long s= (long)(i+j);
		System.out.println("long sum="+s);
	}
	public static void main(String[] args) {
		MainAppFunctionOverload obj = new MainAppFunctionOverload();
		obj.add(5, 6);
		obj.add(3.0f, 3.6f);
		obj.add(33.4,33.9 );
	}

}
