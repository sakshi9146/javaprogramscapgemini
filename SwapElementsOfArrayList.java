package com.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SwapElementsOfArrayList {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("is");
		l.add("name");
		l.add("My");
		l.add("Saksi");
		System.out.println("Actual list is : "+l);
		Collections.swap(l,0,2);
		System.out.println("After sawping : ");
		/*for(String str :l) {
			System.out.println(str);
		}*/
		Iterator<String>it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
