package com.array;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String>ar1= new ArrayList<String>();
		ar1.add("Sakshi");
		ar1.add("Patil");
		System.out.println("ArrayList is :"+ar1);
		
		//Declaration of array 
		String[]strar = new String[ar1.size()];
		ar1.toArray(strar);
		System.out.println("Content of Array: ");
		for(String str:strar) {
			System.out.println(str);
		}
			
		
	}

}
