package com.ou_test;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {
	
	public static void main(String[] args) {
		String s = "abbadc";
		
		int maxLength = 0;
		int startIndex = 0;
		int left = 0;
		
		Map<Character,Integer> map = new HashMap();
		
		for(int right = 0;right < s.length();right++)
		{
			char c = s.charAt(right);
			if(map.containsKey(c))
			{
				left = Math.max(left, left + map.get(c) + 1);
			}
			
			map.put(c, right);
			
			if(right - left + 1 > maxLength)
			{
				maxLength = right - left + 1;
				startIndex = left; 
			}
			
		}
		
		
		System.out.println(s.subSequence(startIndex, startIndex + maxLength));
	}
	
	

}
