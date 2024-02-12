package com.edu;

class Employee implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("Inside the run method"+i+" "+Thread.currentThread());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
}
public class PracticeRunnable {

	public static void main(String[] args) throws InterruptedException {
		Employee mob =  new Employee();
		Thread tob = new Thread(mob);
		tob.setName("First");
		System.out.println("Name of thread is "+tob.getName());
		tob.start();
		tob.join();
		
		Employee mob1 =  new Employee();
		Thread tob1 = new Thread(mob1);
		tob1.setName("Second");
		tob1.start();
		tob1.join();	
		//tob.start();
		
		Employee mob2 =  new Employee();
		Thread tob2 = new Thread(mob2);
		tob2.setName("Third");
		tob2.start();
		//tob2.join();

	}

}
