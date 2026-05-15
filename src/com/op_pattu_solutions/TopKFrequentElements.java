package com.op_pattu_solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
	
	public static void main(String[] args) {
		int arr [] = {1,1,2,1,2,3,4,5,4};
		int k = 3;
		
		Map<Integer,Integer> map = new HashMap();
		
		for(int i = 0;i<arr.length;i++)
		{
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>((a,b) -> map.get(b) - map.get(a));
		
		for( int nums : map.keySet())
		{
			queue.offer(nums);
			if(queue.size() > k)
			{
				queue.poll();
			}
			
		}
		
		int [] result = new int[k];
		
		for(int i = 0;i<k;i++)
		{
			result[i] = queue.poll();
		}
		
		for( int n : result)
		{
			System.out.println(n);
		}
		
	}

}
