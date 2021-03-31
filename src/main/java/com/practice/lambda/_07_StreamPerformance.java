package com.practice.lambda;

import java.util.Arrays;
import java.util.List;

public class _07_StreamPerformance {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 
				                              19, 20);
		//given an ordered list, find the double of the even number greater than 3
		
		/*
		Computatioon 1: element: 1, is it greater than 3 : no, go ahead
		Computatioon 2: element: 2, is it greater than 3 : no, go ahead
		Computatioon 3: element: 3, is it greater than 3 : no, go ahead
		Computatioon 4: element: 5, is it greater than 3 : yes, is it even: no, go ahead
		Computatioon 5: element: 4, is it greater than 3 : yes, is it even: yes, double it. this is our element
		*/
		System.out.println(
		numbers.stream()
		       .filter(e -> e >3)
		       .filter(e -> e% 2 == 0)
		       .map(e -> e * 2)
		       .findFirst());
		
		System.out.println("--------------");
		
		//prove of the above
		
		System.out.println(
				numbers.stream()
				       .filter(_07_StreamPerformance::isGreterThan3)
				       .filter(_07_StreamPerformance::isEven)
				       .map(_07_StreamPerformance::doubleIt)
				       .findFirst()); //if terminal operations are not done, streams won't run any method
		
		System.out.println("--------------");
		
				numbers.stream()
				       .filter(_07_StreamPerformance::isGreterThan3)
				       .filter(_07_StreamPerformance::isEven)
				       .map(_07_StreamPerformance::doubleIt);
				       //.findFirst(); //if terminal operations are not done, streams won't run any method
				
				System.out.println("Done: ");
	}
	
	public static boolean isGreterThan3(int number) {
		System.out.println("isGreterThan3: " + number);
		return number > 3;
	}
	
	public static boolean isEven(int number) {
		System.out.println("isEven: " + number);
		return number % 2 == 0;
	}
	
	public static int doubleIt(int number) {
		System.out.println("doubleIt: " + number);
		return number * 2;
	}
}
