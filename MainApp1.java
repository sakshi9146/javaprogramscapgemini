package com.edu.exe;

public class MainApp1 {

	public static void main(String[] args) {
		int a[]=new int[5];
		System.out.println("before array element assigning");
		try {
		a[5]=10;//ArrayIndexOutOfBound
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		finally {
		System.out.println("after array element assignig");
		}
		try {
			//try block contains monitor statements
		String s="abc";
		
		//int i =Integer.parseInt(s);//NumberFormatException will throw
		//System.out.println(i);
		 int i = Integer.parseInt(s); //NumberFormatException
		   System.out.println("After parse");
		}catch(NumberFormatException e) {
			  e.printStackTrace();
		}
		finally {
			System.out.println("Finally will always execute");
		}
		System.out.println("End of the Program");
		
	}

}
