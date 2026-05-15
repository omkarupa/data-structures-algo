package com.op_pattu_solutions;

public class MergeSort {

	public static void main(String[] args) {
		
		int arr [] = {38 ,43, 56, 29, 10};
		
//		Longest Substring Without Repeating Characters
//
//		Trapping Rain Water
//		
//		Kth Largest Element
//		LRU Cache
//		
//		Top K Frequent Elements
		
		mergesort(arr,0,arr.length);
		
		for(int i:arr) {
			System.out.print(i+" ,");
		}
	}

	private static void mergesort(int[] arr, int left, int right) {
		
		if(left<right) {
			int mid=left+(right-left)/2;
			
			mergesort(arr,left,mid);
			mergesort(arr, mid+1, right);
			
			merge(arr,left,right,mid);
		}
	}

	private static void merge(int[] arr, int left, int right,int mid) {

		int n1=mid-left+1;
		int n2=right-mid;
		
		
		int[] arr1=new int[n1];
		int[] arr2=new int[n2];
		
		for(int i=0;i<n1;i++) {
			arr1[i]=arr[left+i];
		}
		for(int i=0;i<n2;i++) {
			arr2[i]=arr[mid+i+1];
		}
		int i=0;
		int j=0;
		int k=left;
		
		while(i<n1 && j<n2) {
			if(arr1[i]<arr2[j]) {
				arr[k]=arr1[i];
				i++;
			}else {
				arr[k]=arr2[j++];
			}
			
		k++;
		}
		while(i<n1) {
			arr[k++]=arr1[i++];
		}
		while(j<n2) {
			arr[k++]=arr2[j++];
		}
	}

}
