package com.array;

import java.util.ArrayList;

public class MyBasicArrayList {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("JAVA");
		a1.add("C++");
		a1.add("Perl");
		a1.add("PHP");
		System.out.println(a1);
		
		//get the elements by index
		System.out.println("Element at index 1: "+a1.get(1));
		System.out.println("Does the List contains the JAVA :-"+a1.contains("JAVA"));
		//add the elements at particular index
		a1.add(2, "PLAy");
		System.out.println(a1);
		System.out.println("IS the list is Empty :- "+a1.isEmpty());
		System.out.println("Index of Pear is :- "+a1.indexOf("Perl"));
		System.out.println("The size of List is:- "+a1.size());
	}

}
