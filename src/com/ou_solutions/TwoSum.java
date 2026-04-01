package com.ou_solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static void main(String[] args) {
		int [] nums = {3,4,6,7};
		int target = 11;
		
		Arrays.stream(twoSum(nums, target)).forEach(System.out::println);
		
	}
	
	
	public static int [] twoSum(int [] nums, int target)
	{
		
		Map<Integer,Integer> seen = new HashMap();
		
		for(int i =0;i<nums.length;i++)
		{
			int diff = target - nums[i];
			if(seen.containsKey(diff))
			{
				return new int [] {seen.get(diff),i };
			}
			
			seen.put(nums[i], i);
			
		}
		
		return new int [] {-1,-1};
		
		
	}

}
