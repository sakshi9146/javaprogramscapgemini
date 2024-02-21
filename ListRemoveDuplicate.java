package com.edu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListRemoveDuplicate {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(99);
		lst.add(1);
		lst.add(99);
		lst.add(67);
		lst.add(1);
		
		System.out.println(lst);
		Set<Integer> sobj = new HashSet<>(lst);
		System.out.println(sobj);
		

	}

}
