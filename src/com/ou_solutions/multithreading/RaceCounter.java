package com.ou_solutions.multithreading;

public class RaceCounter {

	public static void main(String[] args) throws InterruptedException {
		
		
		Counter counter = new Counter();
		
		Thread t1 = new Thread(() -> {
			for(int i = 0; i< 1000;i++)
			{
				counter.incrementCounter();
			}
		});
		
		Thread t2 = new Thread(() -> {
			for(int i = 0; i< 1000;i++)
			{
				counter.incrementCounter();
			}
		});
		
		t1.start();
		
		t2.start();
		
		t1.join();
		
		t2.join();
		
		System.out.println(counter.counter);
		
		

	}

}
