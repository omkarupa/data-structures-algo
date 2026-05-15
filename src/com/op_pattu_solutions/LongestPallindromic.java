package com.op_pattu_solutions;

public class LongestPallindromic {

	public static void main(String[] args) {
		
		String s = "vaaccddccaa";
		int start=0;
		int end=0;
		
		
		for(int i=0;i<s.length();i++) {
			int len1=expand(s,i,i);
			int len2=expand(s,i,i+1);
			
			int len=Math.max(len1, len2);
			
			if(len>(end-start)) {
				start=i-(len-1)/2;
				end=i+len/2;
			}
		}
		
		System.out.println(s.substring(start,end+1));
		
//		String resultString="";
//		for(int i=0;i<s.length();i++) {
//			String checkString=isPallindromicSub(s,i);
//			if(resultString.length()<checkString.length()) {
//				resultString=checkString;
//			}
//		}
//		System.out.println("resultstring>>"+resultString);

	}

	private static int expand(String s, int left, int right) {
		while(left>0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
			left--;
			
			right++;
			
		}
		return right-left-1;
	}
	
//	boolean isPallindromicSub(String s) {
//		char[] arr = s.toCharArray();
//		int n = arr.length;
//		for (int i = 0; i < n / 2; i++) {
//			if (!(arr[i] == arr[n - 1 - i])) {
//				return false;
//			}
//		}
//		return true;
//	}
	
//	static String isPallindromicSub(String s, int index) {
//		int minindex=index-1;
//		int maxindex=index+1;
//		if(minindex>maxindex || minindex<0 || maxindex>=s.length()) {
//			return "";
//		}
//		while(minindex<maxindex && minindex>=0 && maxindex<s.length() && s.charAt(maxindex)==s.charAt(minindex)) {
//			maxindex+=1;
//			minindex-=1;
//		}
//		System.out.println(minindex+">>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+maxindex);
//
//		return s.substring(minindex+1, maxindex);
//	}

}
