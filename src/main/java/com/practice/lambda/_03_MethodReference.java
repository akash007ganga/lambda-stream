package com.practice.lambda;

import java.util.Arrays;
import java.util.List;

public class _03_MethodReference {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		//1. Case-1
        //for simply pass through values use method reference. lambda directly passed its parameter, as the argument to the println()
        //method. System.out is an object and println() is instance method
        
        numbers.forEach(System.out::println); // here e is passed as a argument to instance method println()
        
        System.out.println("--------------");
        
        //2. Case-2
        //static method
        numbers.stream()
                //.map (e -> String.valueOf(e))
               .map(String::valueOf)  // here e is passed as a argument to static method valueOf()
               .forEach(System.out::println);
        
        System.out.println("--------------");
        
        //3. Case-3
        //target
        numbers.stream()
               .map(String::valueOf)
               //.map(e -> e.toString())
               .map(String::toString) // here toString() is called on object e
               .forEach(System.out::println);
        
        System.out.println("--------------");
        
        //4. Case-4 : two argument
       System.out.println(
        numbers.stream()
               //.reduce(0, (e,total) -> Integer.sum(e, total)) //start with zero
                 .reduce(0,  Integer::sum)// remove the common (e,total) on both sides
       );
        
       System.out.println("--------------");
       
       //5. Case-5 : argument
       System.out.println(
        numbers.stream()
               .map(String::valueOf)
               //.reduce("", (carry, str) -> carry.concat(str)) 
               .reduce("",  String::concat)
       );
	}
}
