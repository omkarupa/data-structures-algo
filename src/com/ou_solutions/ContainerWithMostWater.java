package com.ou_solutions;

public class ContainerWithMostWater {
	
	public static void main(String[] args) {
		int [] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
		
		int left = 0;
		int right = arr.length - 1;
		int maxArea = 0;
		
		while(left < right)
		{
			int height = 0;
			int width = right - left;
			if(arr[left] < arr[right])
			{
				height = arr[left];
				left++;
			}
			else {
				height = arr[right];
				right--;
			}
			
			
			int currentArea = height * width;
			
			maxArea = Math.max(maxArea, currentArea);
				
			
		}
		
		System.out.println("Max Area " + maxArea);
		
		
		
	}

}
