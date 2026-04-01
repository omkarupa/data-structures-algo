package com.ou_solutions;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

	public static void main(String[] args) {
		
		String s = "abcabcbb";
		
		System.out.println(findLongestSubString(s));

	}
	
	public static int findLongestSubString(String s)
	{
		
		Set<Character> seen = new HashSet<Character>();
		int left = 0;
		
		for(int i = 0;i<s.length();i++)
		{
			
			if(seen.contains(s.charAt(i)))
			{
				seen.remove(s.charAt(left));
				left--;
			}
			
			seen.add(s.charAt(i));
			left++;
		
			
		}
		
		
		return left;
		
	}

}
