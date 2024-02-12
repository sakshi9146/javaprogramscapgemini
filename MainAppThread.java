package com.edu;

 class MyClass extends Thread{

	 public void run() {
		 for(int i=1;i<=5;i++) {
		 System.out.println("display method "+i+" "+Thread.currentThread());
		 }
	 }
 }
 //JVM is responsible for starting the thread 
public class MainAppThread {

	public static void main(String[] args) {
		//thread given by jvm
		System.out.println("Thread "+Thread.currentThread());
		MyClass tob = new MyClass();
		tob.setName("first");
		System.out.println("Is first thread is alive "+tob.isAlive());
		//tob.run();
		tob.start();//thread can't be started more than once ,illegalThreadfStateException
		//tob.start();
		System.out.println("Is first thread is alive "+tob.isAlive());
		System.out.println("after job");
		MyClass tob1 = new MyClass();
		tob1.setName("second");
		System.out.println("Is Second thread is alive "+tob1.isAlive());
		tob1.start();
		System.out.println("Is second thread is alive "+tob1.isAlive());
		//tob1.run();
	}

}
