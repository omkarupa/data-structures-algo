package com.ou_solutions.multithreading;

public class Counter {
	
	int counter = 0;
	
	public synchronized void incrementCounter()
	{
		counter++;
	}

}
