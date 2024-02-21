package com.edu.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class OccuranceCharString {

	public static void main(String[] args) {
		String s= "sakshi";
		//convert string to array
		char ch[]=s.toCharArray();
		List<Character>clist= new ArrayList<>();
		for(int i=0;i<ch.length;i++) {
			clist.add(ch[i]);
		}
		System.out.println(clist);
		
		Map<Character,Integer> mp = new HashMap<>();
		
		for(int i=0;i<clist.size();i++) {
		mp.putIfAbsent(clist.get(i), Collections.frequency(clist, clist.get(i)));
		
		}
		System.out.println(mp);
		for(Entry<Character, Integer> mobj:mp.entrySet()) {
			System.out.println(mobj.getKey()+" =======>  "+mobj.getValue());
	}

}
}