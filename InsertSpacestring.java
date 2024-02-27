package com.edu.java8features;

import java.util.stream.Collectors;

public class InsertSpacestring {

	public static void main(String[] args) {
		String s="CAPGEMINI"	;
		
		String s1 = s.chars()
				.mapToObj(c->(char)c+" ")  //C A P G E M I N I
				.collect(Collectors.joining());
						
		System.out.println(s1);
		//System.out.println(s1.length());
			

	}

}
