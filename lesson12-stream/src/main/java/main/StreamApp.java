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
		List<Dish> menu = getAll();

		List<String> temp = menu.stream().filter(d -> d.getCalories() > 300).map(Dish::getName)
				.collect(Collectors.toList());

		List<String> result = temp.stream().skip(temp.size() - 3).collect(Collectors.toList());

		result.forEach(System.out::println);

		// operation versus terminal operation
		System.out.println("==========================");
		long count = menu.stream().filter(d -> d.getCalories() > 300).map(Dish::getName).count();

		System.out.println("Count: " + count);

		List<Dish> dishs = menu.stream().filter(distinctBy(Dish::getCalories))
				.collect(Collectors.toList());

		dishs.forEach(System.out::println);

	}

	private static <T, R> Predicate<T> distinctBy(Function<T, R> fun) {
		Set<R> noDup = new HashSet<>();
		return t -> noDup.add(fun.apply(t));
	}

	private static List<Dish> getAll() {
		List<Dish> menu = Arrays.asList(new Dish("1", "D1", 308, Kind.OTHER, false),
				new Dish("2", "D2", 105, Kind.OTHER, true), new Dish("3", "D3", 329, Kind.MEAT, true),
				new Dish("4", "D4", 302, Kind.MEAT, false), new Dish("5", "D5", 480, Kind.FISH, true),
				new Dish("6", "D5", 480, Kind.FISH, true), new Dish("7", "D5", 480, Kind.FISH, true));

		return menu;
	}
}
