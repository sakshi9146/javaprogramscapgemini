package com.array;

import java.util.ArrayList;

public class MyArrayListClone {

	public static void main(String[] args) {
		ArrayList<String> a1= new ArrayList<String>();
		a1.add("Sakshi");
		a1.add("Madhukar");
		a1.add("patil");
		System.out.println("Actual List is :"+a1);
		ArrayList <String> copy =(ArrayList<String>)a1.clone();
		System.out.println("Cloned list :"+copy);

	}

}
