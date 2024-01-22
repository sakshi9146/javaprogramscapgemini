package com.string;

public class SplitDemo {

	public static void main(String[] args) {
		String s="welocome to EduBridge to To";
		String str[]=s.split(" "); //{"welocome","to","EduBridge","to","to"}
		System.out.println(str);
		
//		for(int i=0;i<str.length;i++) {
//			System.out.println(str[i]);
//		}
		int w=0;
		//using for each loop
		for(String word:str) {
			//System.out.println(i);
			//if(word.equals("to")) {
			if(word.equalsIgnoreCase("to")) {
				w++;
			}
		}
		
		System.out.println("No to "+w);
	}

}
