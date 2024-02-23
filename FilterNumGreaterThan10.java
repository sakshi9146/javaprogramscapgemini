package com.edu.java8features;

import java.util.function.Predicate;

public class FilterNumGreaterThan10 {

	public static void main(String[] args) {
		int ar[]= {1,3,4,5,6,77,22,87,12,43,66};
		Predicate<Integer>pob =(i)->i>10;
		myMethod(ar,pob);

	}

	private static void myMethod(int[] ar, Predicate<Integer> pob) {
		for(int i:ar) {
			if(pob.test(i)) {
				System.out.println(i);
			}
		}
		
	}

}
