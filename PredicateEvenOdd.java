package com.edu.java8features;

import java.util.function.Predicate;

public class PredicateEvenOdd {

	public static void main(String[] args) {
		Predicate<Integer> pob = (i)->i%2==0;
		boolean b= pob.test(2);
		if(b) {
			System.out.println("Even");
		}else {
			System.out.println("odd");
		}
		
		Predicate<Integer> pob1 =(i)->i%2!=0;
		boolean b1 = pob1.test(3);
		if(b1) {
			System.out.println("odd");
		}else {
			System.out.println("even");
		}
	}

}
