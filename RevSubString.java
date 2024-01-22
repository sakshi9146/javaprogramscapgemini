package com.string;

public class RevSubString {

	public static void main(String[] args) {
		String s = "EDUBRIDGE";
				  //012345678	
		for(int i=1;i<s.length();i++) {
			System.out.println(s.substring(0,i));
		}

	}

}
