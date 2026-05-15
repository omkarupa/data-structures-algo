package com.op_solutions.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PattuTest {
	
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList(
		        "apple",
		        "banana",
		        "mango",
		        null,
		        null,
		        "grapes",
		        "banana",
		        "watermelon",
		        "pear",
		        "pineapple"
		);
		
		//reverse every word in the list 
		
		words.stream().filter(e -> e != null).forEach(System.out::println);
		
//		List<String> reverseWords=words.stream().map(s->new StringBuilder(s).reverse().toString()).collect(Collectors.toList());
//		System.out.println(reverseWords);
//		// find first non-repeating charater in given string
//		String s = "programming";
//		
//		Optional<Character> i = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(e->e.getValue()==1).map(e -> e.getKey()).findFirst();
//		System.out.println(i);
		
		
		
	
	}

}
