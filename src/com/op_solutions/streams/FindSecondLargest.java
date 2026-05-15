package com.op_solutions.streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindSecondLargest {
	public static void main(String[] args) {
		
		int arr [] = {1,2,6,4,5};
		
		Arrays.sort(arr);
		
		System.out.println(arr[arr.length-2]);
		
		int first = -1;
		int second = -1;
		
		for(int n : arr)
		{
			if(n > first)
			{
				second = first;
				first = n;
			}
			else if (n > second && n != first)
			{
				second = n;
			}
			
		}
		
		System.out.println( "second" + second);
		System.out.println( "first " + first);
		
		
	}

}
