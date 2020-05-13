package com.practice.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _6_ReduceOperation_Map {
	public static void main(String[] args) {

		//create a map as name and age as key and person as value
		List<Person> people = createPerson();
		System.out.println(
		   people.stream()
		         .collect(Collectors.toMap(
		    		      person-> person.getName() + person.getAge(), //key
		    		      person -> person //value
		    		     )));
	}
	
	public static List<Person> createPerson() {
		return Arrays.asList(
		  new Person("Pal", "Male", 30),
		  new Person("Pal", "Male", 35),
		  new Person("tania", "Female", 27),
		  new Person("bob", "Male", 40),
		  new Person("sara", "Female", 35),
		  new Person("tania", "Female", 29)
		);
	}
}


class Person {
	String name;
	String Gender;
	int age;
	
	public Person(String name, String gender, int age) {
		super();
		this.name = name;
		Gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}	
}