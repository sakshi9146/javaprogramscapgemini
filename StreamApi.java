package com.edu.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		
		for(int i=1;i<=10;i++) {
			l.add(i);
		}
		System.out.println(l);
		//filter even number from list
		List<Integer> evenList = new ArrayList<>();
//		for(int i:l) {
//			if(i%2==0) {
//				System.out.println(i);
//				evenList.add(i);
//			}
//		}
//		System.out.println("Even list elements :"+evenList);
		
		//convert list to stream
		Stream<Integer> s= l.stream();
		
		//s.filter(n->n%2==0).forEach(System.out::println);
		
		//convert stream to list 
		List<Integer>l1 = s.filter(n->n>5).collect(Collectors.toList());
		
		System.out.println("After conversion of Stream to list "+l1);
		//Filter odd number
		Stream<Integer> s1 =l.stream();
		s1.filter(n->n%2!=0).forEach(System.out::println);
	
	
	Integer a[]= {3,39,4,5,8,7};
	Stream<Integer> sar = Stream.of(a);
	Stream<Integer>rawdata=Stream.of(5,3,7,12,89);
	//filter number greater than 5
	
//	List<Integer> r1 =rawdata.filter(n->n>10).collect(Collectors.toList());
//	System.out.println(r1);
	rawdata.filter(n->n>10).forEach(System.out::println);
	}
}