package main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import bean.Dish;

public class StreamApp {
	public static void main(String[] args) {
		List<Dish> menu = getAll();

		List<String> tmp = menu.stream().filter(d -> d.getCalories() > 300).map(Dish::getName).skip(1)
				// .limit(2)
				.collect(Collectors.toList());

		List<String> result = tmp.stream().skip(tmp.size() - 3).collect(Collectors.toList());
		result.forEach(System.out::println);
	}

	private static List<Dish> getAll() {
		return Arrays.asList(new Dish("1", "pork", 308, false), new Dish("2", "beef", 105, true),
				new Dish("3", "chicken", 329, true), new Dish("4", "dog", 302, false),
				new Dish("5", "meomeo", 480, true));
	}
}
