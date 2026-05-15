package com.ou_test;

public class TrappingRainWater {

	public static void main(String[] args) {
		
		int height [] = {3,1,2,4,0,1,3,2};
		
		int water = 0;
		
		int leftMax = 0;
		int rightMax = 0;
		
		int left = 0;
		int right = height.length - 1;
		
		while(left < right)
		{
			if(height[left] < height[right])
			{
				if(height[left] >= leftMax)
				{
					leftMax = height[left];
				}
				else {
					water = water + leftMax - height[left];
				}
				left++;
			}
			else {
				if(height[right] >= rightMax)
				{
					rightMax = height[right];
				}
				else {
					water = water + rightMax  - height[right];
				}
				right--;
			}
			
			System.out.println(water);
		}
		
		System.out.println(" Final water collected between the walls " + water);
		
	}

}
