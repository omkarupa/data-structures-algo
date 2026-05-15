package com.ou_solutions;

public class ReverseString {
	
	public static void main(String[] args) {
		String s = "ommk";
		
		String rev = new StringBuilder(s).reverse().toString();
		
		System.out.println(rev);
		
	}
	
	public static String reverseString(String s)
	{
		
		int left = 0;
		int right = s.length() - 1;
		char[] chars = s.toCharArray();
		
		while(left < right)
		{
			chars[left] = s.charAt(right);
			chars[right] = s.charAt(left);
			left++;
			right--;	
		}
		
		
		
		return new String(chars);
		
		
	}

}
