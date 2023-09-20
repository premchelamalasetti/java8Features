package com.java8feature;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

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
		Consumer<Integer>  consumer= t -> System.out.println(t);
		consumer.accept(113);
		
		List<String> listToMap =Arrays.asList("1:prem","2:kumar","3:ch");
		Map<String, String> lmap=listToMap.stream().map(s -> s.split(":"))
				.collect(Collectors.toMap( pair -> pair[0], pair -> pair[1]));
		lmap.forEach((key,value) -> System.out.println(key+" key "+value+" value"));
	}
}
