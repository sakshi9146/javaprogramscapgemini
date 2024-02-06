package com.edu.exe;

public class MainApp {

	public static void main(String[] args) {
		int a=10,b=0,c=0;
		System.out.println("Befor Division");
		try {
			//monitored ststement put inside try block
		c=a/b;
		}catch(ArithmeticException e){
			e.printStackTrace();
			
		}
		System.out.println("After Division");
		//System.out.println("c ="+c);

	}

}
