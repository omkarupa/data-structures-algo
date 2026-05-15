package com.ou_solutions;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		
		String p = ")([]{}";
		
		System.out.println(isValidParenthesis(p));
		
	}
	
	public static boolean isValidParenthesis(String p)
	{
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0;i<p.length();i++)
		{
			
			char c = p.charAt(i);
			
			if(c == '(' || c== '[' || c == '{')
			{
				stack.push(c);
			}
			else {
				if(stack.isEmpty()) return false;
				
				char top = stack.pop();
				
				if((c == ']' && top != '[') || (c == ')' && top != '(') || c == '}' && top != '{')
				{
					return false;
				}
				
			}
			
			
		}
		
		return stack.isEmpty();
	}

}
