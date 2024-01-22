package com.string;

public class StringFunMain {

	public static void main(String[] args) {
		// isBlank, isEmpty,isNull
		String s1="";//blank
		System.out.println("Length of s1 = "+s1.length());
		String s2=" ";//empty
		System.out.println("Length of s2 = "+ s2.length());
		//String s2=null;//memory not allocated throws exception
		if(s1.isBlank()) {
			System.out.println("s1 is blank");
		}else {
			System.out.println("Not Blank");
		}
		if(s2.length()==0) {
			System.out.println("String is empty");
			
		}else {
			System.out.println("String is not empty");
		}

	}

}
