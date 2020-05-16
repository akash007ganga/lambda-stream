package com.practice.lambda;

import java.util.List;
import java.util.stream.IntStream;

public class _9_TerminalOperation {
	
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		// toArray()		
		Integer [] numArr = numbers.stream()
		                       .toArray(Integer[]::new);
		
		System.out.println("sum():");
		System.out.println(numbers.stream()
				                   .mapToInt(Integer::intValue)
				                   .sum());
		
		System.out.println("min():");
		System.out.println(numbers.stream()
                .mapToInt(Integer::intValue)
                .min());
		
		System.out.println("max():");
		System.out.println(numbers.stream()
                .mapToInt(Integer::intValue)
                .max());
		
		System.out.println("count():");
		System.out.println(numbers.stream()
                .mapToInt(Integer::intValue)
                .count());
		
		System.out.println("findFirst even:");
		System.out.println(numbers.stream()
                .mapToInt(Integer::intValue)
                .filter(e -> e %2 ==0)
                .findFirst());
		
		System.out.println("findAny even greater than 5:");
		System.out.println(numbers.stream()
                .mapToInt(Integer::intValue)
                .filter(e -> e > 5)
                .filter(e -> e %2 ==0)
                .findAny());
		
		System.out.println("avg():");
		System.out.println(numbers.stream()
                .mapToInt(Integer::intValue)
                .average());
		
		System.out.println("range():");
		IntStream.range(6, 10)
				 .forEach(System.out::println);
		
		System.out.println("anyMatch :");
		System.out.println(numbers.stream()
								  .anyMatch(e -> e % 3 == 0));
		
		System.out.println("allMatch :");
		System.out.println(numbers.stream()
				  .allMatch(e -> e % 3 == 0));
		
		System.out.println("noneMatch :");
		System.out.println(numbers.stream()
				  .noneMatch(e -> e >11));
	}
	
}
