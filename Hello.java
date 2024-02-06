package com.edu;

public class Hello {
	void sum(int a, int b ) {
		System.out.println(a+b);
		System.out.println("first");
	}
	void sum(long x ,long y) {
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		Hello h =  new Hello();
		h.sum(50, 50);
		//h.sum(50, 50);

	}

}
 