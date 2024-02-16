package com.array;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffelArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("My");
		list.add("Name");
		list.add("is");
		list.add("Sakshi");
		list.add("Patil");
		System.out.println("Actual list is :"+list);
		Collections.shuffle(list);
		System.out.println("After Shuffel the list is :");
		for(String str :list) {
			System.out.println(str);
		}

	}

}
