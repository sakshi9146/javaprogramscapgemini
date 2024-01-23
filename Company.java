package com.object;
//Single Inheritance 
class Cemployee{
	String name="Sit";
	
	
}
class Programmer extends Cemployee{
	
	String designation="learner";
}

public class Company {

	public static void main(String[] args) {
		Programmer p1 = new Programmer();
		System.out.println(p1.name+" "+p1.designation);
		

	}

}
