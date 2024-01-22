package com.string;

public class AmStringSplit {

	public static void main(String[] args) {
		String s ="I am in Amsterdam am I";
		String str[]=s.split(" ");
		System.out.println("No of Words "+str.length);
		System.out.println(str);
		int c=0;
		for(String word:str) {
			if(word.equalsIgnoreCase("am")) {
				c++;
			}
		}
		System.out.println("No of am "+c);

	}

}
