package com.practice.lambda;

import java.util.Arrays;
import java.util.List;

public class _4_FunctionComposition {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		//given the values double the even numbers and total
		
		//Imperative style
		
		int sum = 0;
		for(Integer num : numbers) {
			if((num %2 == 0)) {
				sum = sum + (num *2);
			}
		}
		System.out.println(sum);
		
		System.out.println("--------------");
		
		//Functional style -1
		System.out.println(
		  numbers.stream()
		         .filter(e -> e %2 == 0)
		         .map(e -> e *2)
		         .reduce(0, Integer::sum));
		
		System.out.println("--------------");
		
		//Functional style -2
		//Function composition-> Pipeline 
		System.out.println(
				  numbers.stream()
				         .filter(e -> e %2 == 0)
				         .mapToInt(e -> e *2)
				         .sum());
		
	}
}
