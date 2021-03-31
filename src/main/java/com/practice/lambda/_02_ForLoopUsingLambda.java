package com.practice.lambda;

import java.util.Arrays;
import java.util.List;

public class _02_ForLoopUsingLambda {
	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        //external iterator
        for(int i=0; i<numbers.size(); i++) {
        	System.out.println(i);
        }
        
        System.out.println("--------------");
        
        //internal iterator. 
        numbers.forEach(value -> System.out.println(value));
        //Parenthesis is optional only for one parameter. For no parameter or two parameter
        //parenthesis is required
	}
}
