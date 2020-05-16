package com.practice.real.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A1 {
	
	public static List<Student> createStudent() {
		return Arrays.asList(
		  new Student("S1", "Male", 20200512),
		  new Student("S2", "Male", 20200513),
		  new Student("S3", "Female",20200514),
		  new Student("S4", "Male", 20200515),
		  new Student("S5", "Female", 20200516),
		  new Student("S6", "Female", 20200517)
		);
	}
	
	
	public static void main(String[] args) {
		List<Student> students = createStudent();
		
		List<Integer> ids = students.stream()
		                            .map(Student::getId)
		                            .collect(Collectors.toList());
		System.out.println("id[" + ids + "]");
 	}
}