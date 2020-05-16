package com.practice.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _8_StreamProperties {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);
		
		System.out.println(
				numbers.stream()
				       .filter(e -> e % 2 == 0)
				       .sorted() //sorted
				       .distinct() //distinct
				       .collect(Collectors.toList())
				);
	}
}
