package com.edu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainApp1 {

	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(11);
		alist.add(22);
		alist.add(33);
		System.out.println(alist);
		alist.add(0,55);
		System.out.println(alist);
		
		//declare another arraylist store the names of student
		//Another list store float values
		List<String> names = new ArrayList<String>();
		names.add("sakshi");
		names.add("pooja");
		names.add("kedar");
		System.out.println(names);
		
		List<String> snames = new ArrayList<String>();
		snames.add("patil");
		snames.add("shinde");
		snames.add("patil");
		System.out.println(snames);
		//addall
		names.addAll(snames);
		System.out.println(names);
		System.out.println("names exit "+names.containsAll(snames));
		names.addAll(1, snames);
		System.out.println(names);
		
		//create a list store 10 digit phone number
		List<Float> f= new ArrayList<Float>();
		f.add(2.3f);
		f.add(34.3f);
		System.out.println(f);
		
		List<Long>ph = new  ArrayList<Long>();
		ph.add(1234567891L);
		ph.add(9876543212l);
		
		ph.contains(1234567891L);
		System.out.println("1234567891 is there in list");
		//ph.clear();//remove all elements form array list
		System.out.println(ph);
		ph.remove(0);
		System.out.println(ph);
		
		
		
		
	}

}
