package com.edu;

//We can Have Any number Of Blocks in java
public class BlocksJava {
	static {
		System.out.println("static block eill execute first before main");
		
	}
	static{
		System.out.println("Second Staic Block");
	}
	{
		System.out.println("2nd Annonymous");
	}
	{
		System.out.println("Annonymous Block will call befor Constructor calling");
	}
	public BlocksJava() {
		System.out.println("Constructor Block");
	}
	public static void main(String[] args) {
		System.out.println("Main Block");
		BlocksJava obj = new BlocksJava();//Call constructor

	}

}
