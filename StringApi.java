package com.edu.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StringApi {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		
		l.add("sakshi");
		l.add("anuja");
		l.add("aditya");
		l.add("anehal");
		l.add("akshata");
		
		// using stream API
		
		//Filter names Starts with A and Convert to upperCase
		//using lambda Expression
		//convert list to stream
		Stream<String> s= l.stream();
		
		//s.filter(name->name.startsWith("a")).forEach(System.out::println);
		//s.filter(name->name.startsWith("a")).map(na->na.toUpperCase()).forEach(System.out::println);
		
		long n = s.filter(name->name.startsWith("a")).count();
		System.out.println("Count of words Starting with a"+n);
		//using for loop
		for(String name:l){
			if(name.startsWith("s")) {
				String un =name.toUpperCase();
				System.out.println(un);
			}
		}
	}

}
