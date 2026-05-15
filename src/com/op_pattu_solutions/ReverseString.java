package com.op_pattu_solutions;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Omkar";
		
		char[] charArray=s.toCharArray();
		int n=s.length();
		for(int i=0;i<n/2;i++) {
			char temp=charArray[i];
			charArray[i]=charArray[n-i-1];
			charArray[n-i-1]=temp;
		}
		
		System.out.println(new String(charArray));
	}

}
