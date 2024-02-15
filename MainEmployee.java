package com.edu;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



/*create Employee class
		eid
		ename
		esalary
		edept
		eemail
		ephone

		add 5 employee objects to the LinkedList and display 
		employee details using Iterator*/
class Employee{
	private int eid;
	private String ename;
	private double esalary;
	private String edept;
	private String eemail;
	private long ephone;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, double esalary, String edept, String eemail, long ephone) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.edept = edept;
		this.eemail = eemail;
		this.ephone = ephone;
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

	public double getEsalary() {
		return esalary;
	}

	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}

	public String getEdept() {
		return edept;
	}

	public void setEdept(String edept) {
		this.edept = edept;
	}

	public String getEemail() {
		return eemail;
	}

	public void setEemail(String eemail) {
		this.eemail = eemail;
	}

	public long getEphone() {
		return ephone;
	}

	public void setEphone(long ephone) {
		this.ephone = ephone;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", edept=" + edept + ", eemail="
				+ eemail + ", ephone=" + ephone + "]";
	}
	
	
}

public class MainEmployee {

	public static void main(String[] args) {
		List<Employee> eob = new LinkedList<Employee>();
		Employee e1 = new Employee(1,"Sakshi",65665,"Developer","sakshi@gamil.com",988814057l);
		Employee e2 = new Employee(2,"Sejal",5647,"Analyst","sejal@gamil.com",5458365466l);
		Employee e3 = new Employee(3,"kedar",8675,"Tester","kedar@gamil.com",914655744l);
		Employee e4 = new Employee(4,"Sanmati",6545,"Developer","sanmati@gamil.com",46235057l);
		Employee e5 = new Employee(5,"Poonam",6534,"Devops","poonam@gamil.com",42385057l);
		
		eob.add(e1);
		eob.add(e2);
		eob.add(e3);
		eob.add(e4);
		eob.add(e5);
		
		Iterator<Employee> eitor = eob.iterator();
		System.out.println("eid\tename\tesalary\tedept\teemail\tephone");
		System.out.println("---------------------------------------------------------------------------------");
		while(eitor.hasNext()) {
			Employee eob1 = eitor.next();
			System.out.println(eob1.getEid()+"\t"+eob1.getEname()+"\t"+eob1.getEsalary()+"\t"+eob1.getEdept()+"\t "+eob1.getEemail()+"\t"+eob1.getEphone());
			
			
		}
		
	}

}
