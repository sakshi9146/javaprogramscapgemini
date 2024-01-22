package com.string;

public class ReverseWord {

	public static void main(String[] args) {
		String s=" Hello World";
		String word[]=s.split(" ");
		for(String w:word) {
			String s1 = w;
			StringBuffer bf = new StringBuffer(s1);
			String rev= bf.reverse().toString();
			System.out.print(rev+" ");
		}
		 
		
		
		
	}

}
