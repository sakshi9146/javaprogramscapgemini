package com.edu;
//2.Create Thread by implementing Runnable Interface
class Student implements Runnable{

	@Override
	public void run() {
		System.out.println("Inside Run Method"+Thread.currentThread());
		
	}
	
}
public class MainAppRunnable {

	public static void main(String[] args) {
		Student tob = new Student();
		Thread mob = new Thread(tob);
		mob.setPriority(13);
		mob.start();

	}

}
