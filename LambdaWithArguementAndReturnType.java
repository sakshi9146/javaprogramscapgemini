package com.edu.java8features;

interface AdditionCal{
	void add1(int i,int j);
	
	default void display() {
		System.out.println("Default method");
	}
	static void dis() {
		System.out.println("Static method");
	}
}

interface SubCal{
	void sub(int i, int j);
}
public class LambdaWithArguementAndReturnType {

	public static void main(String[] args) {
		AdditionCal aob=(int i,int j)->{
			int s;
			s= i+j;
			System.out.println("sum of "+i+" and "+j+" is "+s);
			
		};
		aob.add1(5,8);
		aob.display();//Default method is called through refernce of object
		AdditionCal.dis();//static method is called through ref od interface name
		SubCal sob = (int i ,int j)->{
			int res;
			res = i-j;
			System.out.println("substractio is "+res);
		};
		sob.sub(9,4);
		//Using lambda expression
		Runnable rob =()->{
			System.out.println("run method is called");
		};
		Thread tob = new Thread(rob);
		tob.start();
	}

}
