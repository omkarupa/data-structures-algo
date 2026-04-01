package com.ou_solutions;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		
		String p = "()[]";
		
		System.out.println(isValidParenthesis(p));
		
	}
	
	public static boolean isValidParenthesis(String p)
	{
		
		Stack<Character> stack = new Stack();
		
		for(int i = 0;i< p.length();i++)
		{
			
			if(stack.isEmpty())
				return false;
			
			if(p.charAt(i) == '(' || p.charAt(i) == '{' || p.charAt(i) == '[' )
			{
				stack.push(p.charAt(i));
			}
			
			if(p.charAt(i) == ')' && stack.pop() == '(' || p.charAt(i) == '}'  && stack.pop() == '{' || p.charAt(i) == ']' && stack.pop() == '[')
			{
				return true;
			}
			
		}
		
		
		
		
		return false;
		
	}

}
