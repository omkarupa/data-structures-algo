package com.ou_test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

	public static void main(String[] args) {
		
		int arr[] = {1,1,2,1,3,2,4,3};
		int k = 3;
		
		Map<Integer,Integer> map = new HashMap();
		
		for(int nums : arr)
		{
			map.put(nums, map.getOrDefault(nums, 0) + 1);
		}
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> map.get(a) - map.get(b));
		
		for(int nums : map.keySet())
		{
			pq.offer(nums);
			
			if(pq.size() > k)
			{
				pq.poll();
			}
			
		}
		
		int [] result = new int [k];
		
		for(int i = 0;i < k;i++)
		{
			result[i] = pq.poll();
			System.out.println(result[i]);
		}
		
		
		

	}

}
