package com.practice.lambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _10_LazyOperation {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		System.out.print("peek :");
		Stream.of("one", "two", "three", "four")
		      .filter(e -> e.length() > 3)
		      .peek(e -> System.out.println("Filtered value: " + e))
		      .map(String::toUpperCase)
		      .peek(e -> System.out.println("Mapped value: " + e))
		      .collect(Collectors.toList());
		
		System.out.print("skip first 3 elements, and limit() to limit to 5 elements from the "
				     + "  infinite stream generated :");
		Stream.iterate(1, i -> i * 2) //The first element (position 0) in the Stream will be the provided seed.
		                              //For n > 0, the element at position n, will be the result of applying
		                              //the function f to the element at position n - 1. 
		                              //this will produce 1, 2, 4, 8, 16, 32, 64, 128
		      .skip(3) // returns a stream with remaining elements after discarding first 3 elements
		      .limit(5)//truncates the stream so that it will contain at most 5 elements
		      .forEach(System.out::println);
		
		System.out.print(numbers.stream()
		                        .mapToInt(Integer::intValue)
		                        .summaryStatistics());
		
		
	}

	
}
