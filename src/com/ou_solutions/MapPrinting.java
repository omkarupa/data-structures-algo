package com.ou_solutions;

import java.util.*;

public class MapPrinting {

	public static void main(String[] args) {
		
		Map<Integer,Integer> map = new HashMap(); 
		
		int n = 10;
		while (n > 1)
		{
			if(map.containsKey(n))
			{
				map.put(n, map.get(n) + 1);
				n--;
			}else {
				map.put(n, 0);
			}
			
			
		}
		
		
		
		for(Map.Entry<Integer,Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey() + "key");
			System.out.println(entry.getValue() + "value");
		}

	}

}
