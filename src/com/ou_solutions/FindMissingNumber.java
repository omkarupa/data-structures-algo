package com.ou_solutions;

public class FindMissingNumber {
	
	public static void main(String[] args) {
		int arr [] = {1,2,4,5};
		
		int n = arr.length + 1 ;
		
		int xor = 0;
		
		
		for(int i : arr)
		{
			xor ^= i;
		}
		
		System.out.println(xor);
		
	}

}
