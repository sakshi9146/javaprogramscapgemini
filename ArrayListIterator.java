package com.array;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		ArrayList<String>arr1 = new ArrayList<String>();
		arr1.add("First");
		arr1.add("Second ");
		arr1.add("Third");
		arr1.add("Random");
		Iterator<String>itor = arr1.iterator();
		while(itor.hasNext()) {
			System.out.println(itor.next());
		}
	

	}

}
