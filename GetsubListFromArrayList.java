package com.array;

import java.util.ArrayList;
import java.util.List;

public class GetsubListFromArrayList {

	public static void main(String[] args) {
		ArrayList<String> a1= new ArrayList<String>();
		a1.add("Mahadev");
		a1.add("Kedarnath");
		a1.add("Mhakaleshwer");
		a1.add("Shiv");
		a1.add("adhinath");
		System.out.println("Array list :"+a1);
		List<String> list= a1.subList(1,3);
		System.out.println("Elements of sub List :"+list);

	}

}
