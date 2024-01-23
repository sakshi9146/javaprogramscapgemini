package com.object;

import java.util.Scanner;

//Print the average of three numbers entered by user
//by creating a class named 'Average' having a method 
//to calculate and print the average
public class Average {
 int n1,n2,n3;
int avg;
 void calulate() {
	 int tot = n1+n2+n3;
	  avg=tot/3;
 }
 void display() {
	 System.out.println("The Average is :"+avg);
 }
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Average a = new Average();
		System.out.println("Enter the Three Numbers:");
		 a.n1 = sc.nextInt();
		 a.n2 = sc.nextInt();
		 a.n3 = sc.nextInt();
		 a.calulate();
		 a.display();
		 }

}
