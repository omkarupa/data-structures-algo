package com.ou_solutions;

import java.util.HashMap;

public class LongestSubstring {

	public static void main(String[] args) {
		
		String s = "abcankvsbbcbb";
		
		int left = 0;
		int startIndex = 0;
		int maxLength = 0;
		
		HashMap<Character,Integer> map = new HashMap();
		
		for(int right = 0; right< s.length();right ++ )
		{
			
			char c = s.charAt(right);
			
			if(map.containsKey(c))
			{
				left = Math.max(left, map.get(c) + 1 );
			}
			
			map.put(c, right);
			
			if(right -  left + 1 > maxLength)
			{
				maxLength = right - left + 1;
				startIndex = left;
			}
			
			
		}
		
		System.out.println(s.substring(startIndex,startIndex + maxLength));
		

	}
	
	
}
