package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


import bean.Dish;
import bean.Dish.Kind;

public class StreamApp {
	public static void main(String[] args) {
		// data source
		List<Dish> menu = getAll();

		List<String> temp = menu.stream() // Stream<Dish>
				.filter(d -> d.getCalories() > 300) // stream<Dish>
				.map(Dish::getName) // Stream<String>
				.collect(Collectors.toList());

		List<String> result = temp.stream()
				.skip(temp.size() - 3)
				.collect(Collectors.toList());
		result.forEach(System.out::println);

		System.out.println("========================");
		// intermediate versus terminal operation
		// lazy

		long count = menu.stream().filter(d -> {
			System.out.println("filter " + d.getName());
			return d.getCalories() > 300;
		}).map(d -> {
			System.out.println("map " + d.getName());
			return d.getName();
		}).limit(2).count();

		System.out.println("count: " + count);

		// get MEAT dishes from initial menu
		// and makes sure that there are no
		// duplicates of calories

		List<Dish> meatDished = menu.stream()
				.filter(d -> Kind.MEAT.equals(d.getKind()))
				.filter(distinctBy(Dish::getCalories))
				.collect(Collectors.toList());

		meatDished.forEach(System.out::println);

	}

	private static <T, R> Predicate<T> distinctBy(Function<T, R> func) {
		Set<R> noDup = new HashSet<>();
		return t -> noDup.add(func.apply(t));

	}

	private static List<Dish> getAll() {
		return Arrays.asList(new Dish("1", "D1", 308, Kind.OTHER, false), 
				new Dish("2", "D2", 605, Kind.OTHER, true),
				new Dish("3", "D3", 329, Kind.OTHER, true), 
				new Dish("4", "D4", 302, Kind.MEAT, false),
				new Dish("5", "D5", 480, Kind.MEAT, false), 
				new Dish("6", "D6", 480, Kind.MEAT, false),
				new Dish("7", "D7", 480, Kind.MEAT, false));
	}
}
