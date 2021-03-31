package com.practice.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _05_ReduceOperation {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);
		System.out.println(
				  numbers.stream()
				         .filter(e -> e %2 == 0)
				         .mapToDouble(e -> e * 2.0)
				         .sum());
		
		System.out.println("--------------");
		
		//double the even values and put into a list
		System.out.println(
				           numbers.stream()
				                  .filter(e -> e % 2 == 0)
				                  .map(e -> e * 2)
				                  .collect(Collectors.toList()));
		
         System.out.println("--------------");
		
		//set unique elements
		System.out.println(
				           numbers.stream()
				                  .filter(e -> e % 2 == 0)
				                  .map(e -> e * 2)
				                  .collect(Collectors.toSet()));
	}
}
