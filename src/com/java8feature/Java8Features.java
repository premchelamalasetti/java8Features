package com.java8feature;

import java.util.Arrays;
import java.util.List;

public class Java8Features {

	// Streams , method refernce, forEach Method, Lambda Expression
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 4, 2, 5, 2, 3, 7, 9, 0);
		System.out.println("*****" + list + "*****");

		List<Integer> slist = list.stream().map(number -> number * number).filter(number -> number % 2 == 0).sorted()
				.toList();
		List<Integer> sortedList = list.stream().sorted().toList();
		System.out.println("____" + sortedList + "____");
		list.stream().forEach(System.out::println);

		System.out.println("----" + slist + "------");
	}
}
