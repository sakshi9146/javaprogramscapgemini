package com.edu.map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MainAppMap {

	public static void main(String[] args) {
		Map<Integer,String> smap = new HashMap<Integer,String>();
		
		smap.put(111, "Sakshi");
		smap.put(211, "Manoj");
		smap.put(234,"Aditya");
		//smap.put(211, "Kedar");
		System.out.println(smap);
		
		//create for LinkedHashMao for 5 Employee data
		
		
		Map<Integer,String> emap= new LinkedHashMap<Integer,String>();
		emap.put(1,"Sushil");
		emap.put(3,"Sejal");
		emap.put(4,"Shiv");
		emap.put(2,"Sakshi");
		emap.put(5,"Savita");
		System.out.println(emap);
		
		//Create TreeMap for phoneno and  name 5 employee
		Map<Long, String> emap1 = new TreeMap<Long,String>();
		emap1.put(9881485057l, "Akansha");
		emap1.put(897453627l, "Sam");
		emap1.put(76344265242l, "Arjun");
		emap1.put(7453724676l, "Soniya");
		emap1.put(24363636455l, "Samir");
		System.out.println(emap1);
		
		Map<String , Long> emap2 = new TreeMap<String,Long>();
		emap2.put( "Akansha",9881485057l);
		emap2.put( "Sam",897453627l);
		emap2.put( "Arjun",76344265242l);
		emap2.put( "Soniya",7453724676l);
		emap2.put( "Samir",24363636455l);
		System.out.println(emap2);
		//Iterator using for loop
		
		System.out.printf("%-20s%-20s","StudentID","StudentName" );
		System.out.println();
		for(Map.Entry<Integer, String> e:smap.entrySet()) {
			System.out.printf("%-20d%-20s", e.getKey(),e.getValue());
			System.out.println();
		}
		
		System.out.printf("%-20s%-20s","EmployeeID","EmployeeName" );
		System.out.println();
		for(Map.Entry<Integer, String> e:emap.entrySet()) {
			System.out.printf("%-20d%-20s", e.getKey(),e.getValue());
			System.out.println();
		}
		
		System.out.printf("%-20s%-20s","EmployeePhone","EmployeeName" );
		System.out.println();
		for(Entry<Long, String> e:emap1.entrySet()) {
			System.out.printf("%-20d%-20s", e.getKey(),e.getValue());
			System.out.println();
		}
		
		System.out.printf("%-20s%-20s","EmployeeName","EmployeePhone" );
		System.out.println();
		for(Entry<String, Long> e:emap2.entrySet()) {
			System.out.printf("%-20s%-20d", e.getKey(),e.getValue());
			System.out.println();
		}
		
	}

}
