package com.edu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class MainAppIterator {

	public static void main(String[] args) {
		List<Integer>lst = new Vector<Integer>();
		lst.add(11);
		lst.add(99);
		lst.add(33);
		lst.add(44);
		lst.add(77);
		System.out.println("The Elements are : ");
		//using for loop
		for(Integer i :lst) {
			System.out.println(i);
		}
		System.out.println("List Elements using Iterator: ");
		Iterator<Integer> itobj = lst.iterator();
		while(itobj.hasNext()) {
			System.out.println(itobj.next());
		}
	}

}
