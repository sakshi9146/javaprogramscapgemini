package com.edu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
//sort Student  data based on student id 
class SortStudentBasedId implements Comparator<Student>{
	public int compare(Student s1, Student s2) {
		if(s1.getId()>s2.getId())
			return 1;
		else if(s1.getId()<s2.getId())
			return -1;
		else 
			return 0;
		
	}
}

// sort the data based on fees
 class SortStudentBasedOnFees implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getSfees()>s2.getSfees())
			return 1;
		else if(s1.getSfees()<s2.getSfees())
			return -1;
		else 
			return 0;
		
	}
	 
 }

 
 //sort student based on names 
 class SortStudentBasedOnNames implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.getName().compareTo(s2.getName());
	}
	 
 }
public class MainApp3ArrayListUserDefinedClass {

	public static void main(String[] args) {
		List<Student> slist = new  ArrayList<Student>();
		Student s1= new Student(55,"Sakshi",123.4f);
		Student s2= new Student(12,"Rijul",12321.4f);
		Student s3= new Student(113,"Kedar",123.8f);
		Student s4= new Student(14,"Sejal",121.5f);
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
		
		//Collections.sort(slist);
		SortStudentBasedId sobj = new SortStudentBasedId();
		Collections.sort(slist,sobj);
		
		System.out.println("After sortin Student Based on id: ");
		
		Iterator<Student>sitor1 = slist.iterator();
		System.out.println("sid\tsname\tsfees");
		System.out.println("-----------------------------------------------");
		while(sitor1.hasNext()) {
			Student sob = sitor1.next();
			//System.out.println(sob);
			System.out.println(sob.getId()+"\t"+sob.getName()+"\t"+sob.getSfees());
		}
		
		//sort based on fees
		SortStudentBasedOnFees sobj1 = new SortStudentBasedOnFees();
		Collections.sort(slist,sobj1);
		
      System.out.println("After sortin Student Based on Fees: ");
		
		Iterator<Student>sitor2 = slist.iterator();
		System.out.println("sid\tsname\tsfees");
		System.out.println("-----------------------------------------------");
		while(sitor2.hasNext()) {
			Student sob = sitor2.next();
			//System.out.println(sob);
			System.out.println(sob.getId()+"\t"+sob.getName()+"\t"+sob.getSfees());
		}
		
		SortStudentBasedOnNames sobj3 = new SortStudentBasedOnNames();
		Collections.sort(slist,sobj3);
		
		System.out.println("After sortin Student Based on Names: ");
		
		Iterator<Student>sitor3 = slist.iterator();
		System.out.println("sid\tsname\tsfees");
		System.out.println("-----------------------------------------------");
		while(sitor3.hasNext()) {
			Student sob = sitor3.next();
			//System.out.println(sob);
			System.out.println(sob.getId()+"\t"+sob.getName()+"\t"+sob.getSfees());
		}
		
	}

}



