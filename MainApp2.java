package com.edu.exe;

public class MainApp2 {
	public static void main(String[] args) {
		
	
int a[]= new int[5];
int b=10,c=2,d=0;
try {
	a[5]=75;
	
	d=b/c;
	}
	//System.out.println(error);
	
	
	
catch(ArrayIndexOutOfBoundsException e) {
	e.printStackTrace();
}
catch(ArithmeticException e) {
	e.printStackTrace();

}
catch(Exception e) {//immediate superclass 
	e.printStackTrace();
}
}
}