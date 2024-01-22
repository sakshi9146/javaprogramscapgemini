package com.string;

public class SubString {

	public static void main(String[] args) {
		String s = "EDUBRIDGE";
                  //012345678
//System.out.println(s.substring(0));
//System.out.println(s.substring(1,4));
		for(int i=0;i<s.length();i++) {
			System.out.println(s.substring(0,i));
		}	
		for(int i=0;i<s.length();i++) {
			System.out.println(s.substring(0,s.length()-i));
		}	

	}

}
