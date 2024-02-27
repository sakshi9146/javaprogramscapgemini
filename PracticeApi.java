package com.edu.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeApi {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		for(int i=1;i<=10;i++) {
			l.add(i);
		}
		//List<Integer> elist = new ArrayList<>();
		
		Stream<Integer> s = l.stream();
		//s.filter(x->x%2==0).forEach(System.out::println);
		//System.out.println(s);
		
		//Stream to list conversion
		List<Integer> l1 = s.filter(n->n>5).collect(Collectors.toList());
		System.out.println(l1);
		
	}

}
