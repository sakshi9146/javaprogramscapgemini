package com.edu.java8features;

interface DisplayName{
	String display(String s);
	
}
public class FunctionEx {

	public static void main(String[] args) {
//		DisplayName dob=(String s)->{
//			return "Hello "+s;
//		};
//		
		DisplayName dob=(s)->"Hello "+s;
		
		System.out.println(dob.display("Sakshi"));
          
	}

}
