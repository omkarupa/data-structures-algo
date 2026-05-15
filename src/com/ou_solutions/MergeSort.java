package com.ou_solutions;

public class MergeSort {

	public static void main(String[] args) {
		
		
		int arr [] = {38 ,43, 56, 29, 10};

		int n = arr.length ;
		
		mergeSort(arr,0,n-1);
		
		
		for (int num : arr )
		{
			System.out.println(num);
		}
		
	}
	
	public static void mergeSort(int arr [] , int left , int right)
	{
		
		if( left < right)
		{
			int m = left + (right - left ) / 2;
			
			mergeSort(arr,left,m);
			mergeSort(arr,m+1,right);
			
			merge(arr,left,m,right);
			
		}
		
		
	}
	
	public static void merge(int arr[],int l , int m , int r)
	{
		int n1 = m - l + 1;
		int n2 = r - m;
		
		int L[] = new int [n1];
		int R[] = new int [n2];
		
		for(int i = 0; i< n1;i++)
		{
			L[i] = arr[l + i];
		}
		for(int j = 0; j < n2;j++)
		{
			R[j] = arr[m + 1 + j];
		}
		
		int i = 0;
		int j = 0;
		
		int k = l;
		
		while ( i < n1 && j < n2 )
		{
			if(L[i] <= R[j])
			{
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i < n1 )
		{
			arr[k] = L[i];
			i++;
			k++;
		}
		
		while(j < n2 )
		{
			arr[k] = R[j];
			j++;
			k++;
		}
		
		
	}

}
