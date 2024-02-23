package com.edu.java8features;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<String,Integer> fob =(s)->s.length();
		
		String s= "sakshi";
		
		int l = fob.apply(s);
		System.out.println("Number of chracters "+l);
		
		String k= "Indian Army";
		Function<String,String> fob1 = (String a)->a.toUpperCase();
		System.out.println(fob1.apply(k));
		}

}
