package com.ou_solutions.multithreading;

public class MyThread1 extends Thread {
	
	public void run()
	{
		for(int i = 1;i<=100;i++)
		{
			System.out.println( i);
		}
		
	}
	
	public static void main(String[] args) {
		
		MyThread1 t1 = new MyThread1();
		t1.start();
		
		
		
		MyThread1 t2 = new MyThread1();
		t2.start();
		
		
	}

}
