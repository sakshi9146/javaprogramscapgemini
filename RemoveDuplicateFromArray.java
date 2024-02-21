package com.edu;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		int a[]= {5,3,4,6,8,3,9,4,5};
		Set<Integer> sob = new TreeSet<>();
		for(int i =0;i<a.length;i++) {
			sob.add(a[i]);
		}
		System.out.println("After Removing Duplicate :");
		Iterator<Integer> iobj = sob.iterator();
		while(iobj.hasNext()) {
			System.out.println(iobj.next());
		}
	}

}
