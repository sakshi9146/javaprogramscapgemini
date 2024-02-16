package com.array;

import java.util.ArrayList;
import java.util.List;

public class MyElementCheck {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("One");
		a.add("Two");
		a.add("Three");
		a.add("Random");
		
		List<String> a1 = new ArrayList<String>();
		a1.add("two");
		a1.add("Three");
		
		System.out.println("Does a contains a1  :"+a.containsAll(a1));
		a1.add("One");
		System.out.println("Does a contains a1  :"+a.containsAll(a1));
	}
}
