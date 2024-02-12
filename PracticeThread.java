package com.edu;

class SecondThreadClass extends Thread{
	public void run() {//when thread starts execution of run method i called Running state
		for(int i=1;i<=5;i++) {
			System.out.println("run method is  by thread"+i+" "+Thread.currentThread());
			try {
				Thread.sleep(2000);//pause the running Thread
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class PracticeThread {

	public static void main(String[] args) throws InterruptedException {
		SecondThreadClass t1 = new SecondThreadClass();//new State
		SecondThreadClass t2 = new SecondThreadClass();

		t1.setName("First");
		t2.setName("second");
		
		t1.start();//Runnable state
		t1.join();
		t2.start();
	}

}
