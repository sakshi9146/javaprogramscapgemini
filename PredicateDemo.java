package com.edu.java8features;

import java.util.Scanner;
import java.util.function.Predicate;

interface MyPredicate{
	boolean myTest(int i);
}
public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> pob = (i)->i>10;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		boolean b = pob.test(num);
		if(b) {
			System.out.println(num+" is grater then 10");
			
		}else {
			System.out.println(num+" is less than 10");
		}
		
		MyPredicate pob1 = (int i)->i>20;
	}

}
