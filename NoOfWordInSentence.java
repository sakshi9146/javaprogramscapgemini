package com.string;

public class NoOfWordInSentence {

	public static void main(String[] args) {
		String s ="Indian Is My Country";
		int c=1;
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)==' ')&& (s.charAt(i+1)!=' ')){
				c++;
			}
		}
		System.out.println("Number Of word count in sentence is "+c);
	}

}
