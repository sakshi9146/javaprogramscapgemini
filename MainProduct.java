package com.edu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*create a class Product
pid
pname
pprice
pedate

add 4 products to the ArrayList and display products using iterator*/

class Product{
	private int pid;
	private String pname;
	private double pprice;
	private String pedate;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int pid, String pname, double pprice, String pedate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
		this.pedate = pedate;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPprice() {
		return pprice;
	}

	public void setPprice(double pprice) {
		this.pprice = pprice;
	}

	public String getPedate() {
		return pedate;
	}

	public void setPedate(String pedate) {
		this.pedate = pedate;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", pedate=" + pedate + "]";
	}
	
	
}
public class MainProduct {

	public static void main(String[] args) {
	List<Product> pob= new ArrayList<Product>();
	Product p1= new Product(101,"Milk",90,"15/2/24");
	Product p2= new Product(102,"curd",20,"16/2/24");
	Product p3= new Product(103,"Magiee",100,"29/2/24");
	Product p4= new Product(104,"Cadbury",145,"19/2/24");
	pob.add(p1);
	pob.add(p2);
	pob.add(p3);
	pob.add(p4);
	
	
	System.out.println("pid\tpname\tpprice\tpedate");
	System.out.println("-------------------------------------------------------");
	Iterator<Product>pitor=pob.iterator();
	while(pitor.hasNext()) {
		Product pob1 =pitor.next();
		System.out.println(pob1.getPid()+"\t"+pob1.getPname()+"\t"+pob1.getPprice()+"\t"+pob1.getPedate());
	}
	

	}

}
