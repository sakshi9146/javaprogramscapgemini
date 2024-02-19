package com.edusetinterfaceuserdefined;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class SortEmployeeById implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getEid()>o2.getEid())
		return 1;
		else if(o1.getEid()<o2.getEid())
			return -1;
		else
			return 0;
				
	}
	
}
class Employee{
	private int eid;
	private String ename;
	private float esalary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, float esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsalary() {
		return esalary;
	}
	public void setEsalary(float esalary) {
		this.esalary = esalary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
	
	
}
public class SetForUserDefinedData {

	public static void main(String[] args) {
		Employee e1 = new Employee(1,"sakshi",87989);
		Employee e2 = new Employee(2,"seajal",79989);
		Employee e3 = new Employee(3,"sanskruti",2989);
		Employee e4 = new Employee(4,"patu",22989);
		Employee e5 = new Employee(5,"samrudhi",85489);
		
		SortEmployeeById sid = new SortEmployeeById();
		Set<Employee> eobj = new TreeSet<Employee>(sid);
		eobj.add(e1);
		eobj.add(e2);
		eobj.add(e3);
		eobj.add(e4);
		eobj.add(e5);
		
		System.out.println(eobj);
		
		

	}

}
