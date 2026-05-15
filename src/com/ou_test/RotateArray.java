package com.ou_test;

public class RotateArray {

	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,5};
		int k = 3;
		
		int n = arr.length - 1;
		k = k % n;
		System.out.println(k);
		
		reverseArray(arr,0,n);
		reverseArray(arr,k,n);
		reverseArray(arr,0, k -1);
		
		for(int num : arr)
		{
			System.out.print( num  + " , ");
		}
		
	}

	private static void reverseArray(int[] arr, int left, int right) {
		
		
		while(left < right)
		{
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		
	}

}
