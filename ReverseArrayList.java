package com.array;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("sakshi");
		l.add("Sejuuu");
		l.add("Patuu");
		l.add("Sanuuu");
		System.out.println("Actual list :"+l);
		Collections.reverse(l);
		System.out.println("Reverse List : ");
		for(String str :l) {
			System.out.println(str);
		}
	}

}
