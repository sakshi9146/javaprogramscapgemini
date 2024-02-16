package com.array;

import java.util.ArrayList;

public class AddArrayListToNewList {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Sakshi");
		ar.add("Patil");
		System.out.println("Existing List :"+ar);
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Sushil");
		list.add("Patil");
		ar.addAll(list);
		System.out.println("After addition of new List :"+ar );
	
	}

}
