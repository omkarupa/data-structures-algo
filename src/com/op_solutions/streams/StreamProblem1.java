package com.op_solutions.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;


public class StreamProblem1 {
	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(9,8,1);
		
		Optional<Integer> sum = list.stream().reduce((a,b)->a+b);
		System.out.println(sum.get());
		double average = list.stream().mapToInt(Integer::intValue).average().orElse(0);
		System.out.println(average);
		
		 Optional<Integer> maxvalue = list.stream().max(Comparator.comparingInt(Integer::intValue));
			System.out.println(maxvalue.get());
			List<String> strlist = List.of("omkar","pratiksha","aai","chaitu","Hi","A");

		long count = strlist.stream().filter(n->n.length()>2).count();
		System.out.println(count);
		
		Integer multi = list.stream().reduce((a,b)->a*b).orElse(1);
		System.out.println(multi);
		List<String> strlist1 = List.of("omkar","pattu");
		List<Character> charList = strlist1.stream().flatMap(word->word.chars().mapToObj(c->(char)c)).distinct().toList();
		System.out.println(charList);
		list.stream().sorted(Comparator.reverseOrder()).forEach(n->System.out.println(n));
		List<String> list2=List.of("a", "a", "cccc");
		Map<Object, List<String>> group = list2.stream().collect(Collectors.groupingBy(a->a.length()));
		System.out.println(group);
		Map<Boolean, List<String>> part = list2.stream().collect(Collectors.partitioningBy(a->a.length()>2));
		System.out.println(part);

		list2.stream().collect(Collectors.groupingBy(n->n,Collectors.counting())).entrySet().stream().forEach(a->System.out.print(a.getKey()+" "+a.getValue()));
		//list.stream().sorted().forEach(System.out::println);
		
//		list.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);
//		
//		List<String> list2 = List.of("omkar","pratiksha","aai","chaitu");
//		
//		list2.stream().sorted().forEach(System.out::println);
//		
//		list2.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//		
//		
//		Map<Object, Object> map = list2.stream().collect(Collectors.toMap(str -> str.length(), str -> str));
//		
//		map.entrySet().stream().forEach(str-> System.out.println( str.getKey() + " " + str.getValue() ));
		
		
		
		
	}

}
