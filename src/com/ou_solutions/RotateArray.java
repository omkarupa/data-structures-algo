package com.ou_solutions;

public class RotateArray {

	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,5,6,7};
		
		int k = 3;
		rotateArray(arr,k);	
		System.out.println(" ");
		for(int n : arr)
		{
			System.out.println(n);
		}
	}

	private static void rotateArray(int[] arr, int k) {
		
		int n = arr.length - 1;
		
		k = k % n;
		
		rev(arr,0,n);
		for(int num : arr)
		{
			System.out.println(num);
		}
		System.out.println(" ");
		rev(arr,k,n);
		for(int num : arr)
		{
			System.out.println(num);
		}
		System.out.println(" ");
		rev(arr,0,k-1);
		for(int num : arr)
		{
			System.out.println(num);
		}
		
		
	}

	private static void rev(int[] arr, int i, int n) {
		
		while( i < n)
		{
			int temp = arr[n];
			arr[n] = arr[i];
			arr[i] = temp;
			i++;
			n--;
		}
		
		
	}

}
