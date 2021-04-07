package main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import bean.Dish;

public class StreamApp {
	public static void main(String[] args) {
		// data source
		List<Dish> menu = getAll();

		List<String> temp = menu.stream() // Stream<Dish>
				.filter(d -> d.getCalories() > 300) // Stream<Dish>
				.map(Dish::getName) // Stream<String>
				.collect((Collectors.toList()));

		List<String> result = temp.stream() // Stream<String>
				.skip(temp.size() - 3) // Stream<String>
				.collect(Collectors.toList());// Stream<String>

		result.forEach(System.out::println);//
	}

	public static List<Dish> getAll() {
		return Arrays.asList(new Dish("1", "pork", 308, false),
			new Dish("2", "beef", 105, true),
			new Dish("3", "chicken", 329, true),
			new Dish("4", "dog", 302, false),
			new Dish("5", "meomeo", 480, true));
}
}