package com.practice.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _06_ReduceOperation_Map {
	
	public static List<Person> createPerson() {
		return Arrays.asList(
		  new Person("Pal", "Male", 30),
		  new Person("Pal", "Male", 35),
		  new Person("tania", "Female", 27),
		  new Person("sushil", "Male", 40),
		  new Person("sadhana", "Female", 35),
		  new Person("tania", "Female", 29)
		);
	}
	
	
	public static void main(String[] args) {

		//create a map as name and id as key and person as value
		List<Person> people = createPerson();
		System.out.println(
				people.stream()
				.collect(Collectors.toMap(
						person-> person.getName() + person.getAge(), //key
						person -> person //value
						)));

		//create a map with
		//key : name
		//value: all the people with same name
		System.out.println("--------------");

		System.out.println(
				people.stream()
				.collect(Collectors.groupingBy(Person::getName)));

		//create a map with
		//key : name
		//value: id of all the people with same name
		System.out.println("--------------");

		System.out.println(
				people.stream()
				.collect(Collectors.groupingBy(Person::getName,
						                       Collectors.mapping(Person::getAge, Collectors.toList())
						                      )));
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