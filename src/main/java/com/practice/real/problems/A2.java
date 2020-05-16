package com.practice.real.problems;

import java.util.Arrays;
import java.util.List;

public class A2 {
	public static void main(String[] args) {
		List<Student> studentFromDB =   Arrays.asList( 
				                              new Student("S1", "Male", 20200512),
				                              new Student("S2", "Male", 20200513),
				                              new Student("S3", "Female",20200514));
		
		List<Student> studentFromExcel =   Arrays.asList( 
                new Student("S1", "Male", 20200512),
                new Student("S2", "Male", 20200513),
                new Student("S4", "Female",20200515));
		
		studentFromDB.stream()
		             .filter(s -> studentFromExcel.contains(s)) //hashcode equals must
		             .forEach(s-> s.setId(0));
		
		System.out.println(studentFromDB);
	}
}
