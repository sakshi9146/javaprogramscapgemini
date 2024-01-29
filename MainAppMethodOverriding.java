package com.edu;
//method final cannot Override
//final data type can't change the value


class BaseClass{
	void display() {//final cannot override
		System.out.println("Base Class");
	}
}

class ChildClass extends BaseClass{
	@Override
	void display() {
		super.display();
		System.out.println("childClass");
	}
}
public class MainAppMethodOverriding {

	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.display();

	}

}
