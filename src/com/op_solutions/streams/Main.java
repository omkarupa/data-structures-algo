package com.op_solutions.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(
		        10, 15, 20, 25, 30,
		        35, 40, 45, 50, 55,
		        60, 65, 70, 75, 80,
		        85, 90, 95, 100, 15,
		        20, 25, 30
		);
		
		// numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		 
		List<Integer> numbers100 = numbers.stream().filter(n -> n >= 100).collect(Collectors.toList());
		 
		//System.out.println(numbers100);
		
		List<Integer> noDuplicates = numbers.stream().distinct().collect(Collectors.toList());
		
		System.out.println(noDuplicates);
		
		List<String> words = Arrays.asList(
		        "apple",
		        "banana",
		        "mango",
		        "orange",
		        "apple",
		        "kiwi",
		        "grapes",
		        "banana",
		        "watermelon",
		        "pear",
		        "pineapple"
		);
		
		words.stream().map(s -> reverse(s)).forEach(System.out::println);
		
		List<String> caps = words.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(caps);
		
		List<String> sorted = words.stream().sorted(Comparator.comparingInt(str -> str.length())).collect(Collectors.toList());
		 
		System.out.println(sorted);
		
		String s =  sorted.stream().sorted(Comparator.reverseOrder()).findFirst().orElse(null);
		
		System.out.println(s);
		
		String str = "abcabcd";
		
		Optional<Character> nonrepeat = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(f -> f.getValue() == 1).map(n-> n.getKey()).findFirst();
		
		System.out.println(nonrepeat);
		
		
		
		
		
		
	}
	
	
	public static String reverse(String s )
	{
		return new StringBuilder(s).reverse().toString();
	}

}
