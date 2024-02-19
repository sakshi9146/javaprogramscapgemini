package com.edu;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
//set is an interface (implemented classes are HashSet,LinkedHashSet,TreeSet)
public class SetDemoMain {

	public static void main(String[] args) {
		Set<Integer> sobj = new HashSet<Integer>();// by default sorting only for class
		//does not maintain the insertion order
		//does no allow duplicates
		sobj.add(77);
		sobj.add(56);
		sobj.add(57);
		sobj.add(55);
		sobj.add(58);
		sobj.add(1);
		System.out.println(sobj);
		
		//LinkedHashSet
		//maintain insertion order
		//no duplicates
		//single null is allowed
		Set<Integer> hs = new LinkedHashSet<Integer>();
		hs.add(5);
		hs.add(4);
		hs.add(7);
		hs.add(1);
		hs.add(null);
		hs.add(4);
		System.out.println(hs);
		//tree set
		//does not follow insertion oder
		//null value is not excepted
		//duplicates are not allowed
		Set<Integer> ts = new TreeSet<>();
		ts.add(3);
		ts.add(83);
		ts.add(1);
		ts.add(3);
		ts.add(7);
		//ts.add(null);
		System.out.println(ts);
		
	}

}
