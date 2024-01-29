package com.edu;
//hierarchical Inheritance
//Final keyword if class don't want to be inheritated.
class Account
{
	Account(){
		System.out.println("Account class Constructor");
		
	}
	
}
class SavingsAccount extends Account{
	SavingsAccount(){
		System.out.println("Savings Account constructor");
	}
}

class CurrentAccount extends Account{
	CurrentAccount(){
		System.out.println("Current Account");
	}
}


	public class MainAppHieararchical {


	public static void main(String[] args) {
		SavingsAccount sob =new SavingsAccount();
		CurrentAccount cob = new CurrentAccount();
	}

}
