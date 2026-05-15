package com.ou_test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsProblems {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,2,5,1,6);
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		List<Integer> duplicates =  nums.stream().filter(n -> !set.add(n)).collect(Collectors.toList());
		
		System.out.println(duplicates);
		
		String s = "interview";
		
		Map<Character,Long> map =  s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(map);
		
		String str = "aabbcdde";
		
		Character strg =  str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(e -> e.getValue() == 1 ).map(e -> e.getKey()).findFirst().get();
		
		System.out.println(strg);
		
		List<Integer> numbers = Arrays.asList(5,1,8,3,9,7);
		
		Integer n = numbers.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).skip(1).findFirst().get();
		System.out.println("Omkar" + n);
		
		
		List<List<Integer>> list = Arrays.asList(
			    Arrays.asList(1,2),
			    Arrays.asList(3,4),
			    Arrays.asList(5,6)
			);
		
		List<String> words = Arrays.asList("java","microservices","spring");
		
		String word = words.stream().max(Comparator.comparing(String::length)).get();
		System.out.println(word);
		
		String sen = "java is good java is powerful";
		
		Long count = Arrays.asList(sen.split(" ")).stream().count();
		
		System.out.println("Count of words " + count);
		
		List<Integer> data = Arrays.asList(1,1,2,3,3,3,4,4);
		
		Integer dt = data.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).map(e -> e.getKey()).get();
		System.out.println(dt);
		
		
		
		
		
	}

}
