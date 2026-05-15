package com.op_solutions.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OmkarTest {
	
	public static void main(String[] args) {
		
		
		
		Employee e1 = new Employee("pratiksha", 28, 3000);
		Employee e2 = new Employee("omkar", 28, 3000);
		Employee e3 = new Employee("aditya", 22, 1000);
		
		List<Employee> empList = Arrays.asList();
		
			int max =	empList.stream().mapToInt(e -> e.getAge()).max().orElse(-1);
			System.out.println(max);
		
		empList.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getAge)).forEach(System.out::println);
		
		List<Integer> numbers = Arrays.asList(1,2,1,2,3,4,4,4,5);
		
		Map<Integer, Long> freq = numbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(freq);
		
		List<Integer> sorted = numbers.stream().sorted(Comparator.comparing(freq::get).thenComparing(s -> (Integer) s).reversed()).collect(Collectors.toList());
		
		System.out.println(sorted);
		
		//Sort employees by name then age.
		//Sort numbers based on frequency.
		//Find common characters between two strings.
		
		String s = "if omkar is good if is";
		
		Map<String, Long> map = Arrays.asList(s.split(" ")).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(map);
		
		map.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed()).forEach(System.out::println);
		
		
		List<Integer> nums = Arrays.asList(1,2,3,2,4,5,1);
		
		nums.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(e -> e.getValue() > 1).map(e -> e.getKey()).forEach(System.out::println);
		
		List<Integer> part = Arrays.asList(2,3,5,7,4,6,8);
		
		Map<Boolean, List<Integer>> vart = part.stream().collect(Collectors.partitioningBy(n -> isPrime(n)));
		
		System.out.println(vart);
		
		
	}
	
	public static boolean isPrime(int n)
	{
		
		for(int i = 2; i<= Math.sqrt(n);i++)
		{
			if( n%i == 0)
			{
				return false;
					
			}
		}
		
		return true;
		
	}


}
