package com.edu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student{
	private int id;
	private String name;
	private float sfees;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, float sfees) {
		super();
		this.id = id;
		this.name = name;
		this.sfees = sfees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSfees() {
		return sfees;
	}

	public void setSfees(float sfees) {
		this.sfees = sfees;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sfees=" + sfees + "]";
	}

	
	
	
}

public class MainApp3ArrayListUserDefinedClass {

	public static void main(String[] args) {
		List<Student> slist = new  ArrayList<Student>();
		Student s1= new Student(111,"Sakshi",1223.4f);
		Student s2= new Student(112,"Rijul",12321.4f);
		Student s3= new Student(113,"kedar",123.8f);
		Student s4= new Student(114,"Sejal",121.5f);
		Student s5= new Student(115,"Rakesh",1231.3f);
		
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		slist.add(s4);
		slist.add(s5);
		
		//System.out.println(slist);
		Iterator<Student>sitor = slist.iterator();
		System.out.println("sid\tsname\tsfees");
		System.out.println("-----------------------------------------------");
		while(sitor.hasNext()) {
			Student sob = sitor.next();
			//System.out.println(sob);
			System.out.println(sob.getId()+"\t"+sob.getName()+"\t"+sob.getSfees());
		}
		
	}

}



