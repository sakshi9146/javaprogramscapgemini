package com.edu.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class OccuranceOfNumber {

	public static void main(String[] args) {
		int a[]= {1,13,3,1,4,31,31,4,12,1};
		
		//put all elemnts in arraylist
		ArrayList<Integer > aa= new ArrayList();
		for(int i= 0;i<a.length;i++) {
			
		
		aa.add(a[i]);
		
		}
		System.out.println("List elements :"+aa);
		
		Map<Integer,Integer> p = new HashMap<Integer,Integer>();
		
		for(int i=0;i<aa.size();i++) {
			//System.out.println(aa.get(i));
			p.putIfAbsent(aa.get(i), Collections.frequency(aa, aa.get(i)));
			
		}
		System.out.println(p);
		
		for(Map.Entry<Integer,Integer>mobj:p.entrySet()) {
			System.out.println(mobj.getKey()+" =======>  "+mobj.getValue());
		}
	}

}
