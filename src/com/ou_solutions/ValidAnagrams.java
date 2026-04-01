package com.ou_solutions;

import java.util.Arrays;

public class ValidAnagrams {
	
	
	public static void main(String[] args) {
		
		String s ="listen",s2= "silent";
		
		System.out.println(isValidAnagram(s, s2));
		
	}
	
	
	public static boolean isValidAnagram(String s1, String s2)
	{
		
		char [] c1 = s1.toCharArray();
		char [] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return Arrays.equals(c1, c2);
		
		
		
	}

}
