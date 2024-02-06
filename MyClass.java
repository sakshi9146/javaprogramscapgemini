package com.edu;

public class MyClass {
MyClass(){
	System.out.println("This is default constructor");
	
}
MyClass(String str){
	System.out.println("This is str"+str);
	
}
MyClass(String str1,String str2){
	System.out.println("This is str1 , str2"+str2);
	
}


	public static void main(String[] args) {
		System.out.println("This is main method");
		MyClass a = new MyClass();

	}

}
