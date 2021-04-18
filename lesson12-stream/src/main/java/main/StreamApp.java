package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import bean.Dish;
import bean.Dish.Kind;

public class StreamApp {
	public static void main(String[] args) {
		List<Dish> menu = getAll();

		List<String> tmp = menu.stream().filter(d -> d.getCalories() > 300).map(Dish::getName).skip(1)
				// .limit(2)
				.collect(Collectors.toList());

		List<String> result = tmp.stream().skip(tmp.size() - 3).collect(Collectors.toList());
		result.forEach(System.out::println);

		// intermediate versus terminal operation
		// lazy
		System.out.println("===============");
		long count = menu.stream().filter(d -> {
			System.out.println("filter " + d.getName());
			return d.getCalories() > 300;
		}).map(d -> {
			System.out.println("map " + d.getName());
			return d.getName();
		}).limit(2).count();
		System.out.println("count: " + count);
		System.out.println("==============");

		List<Dish> meatDishes = menu.stream().filter(d -> Kind.MEAT.equals(d.getKind()))
				// .distinct()//hashcode,equals according to property which produce
				.filter(distinctBy(Dish::getCalories)).collect(Collectors.toList());
		meatDishes.forEach(System.out::println);

		Double sum1 = menu.stream().filter(d -> d.isVegetarian()).map(Dish::getCalories).reduce(0d, Double::sum);
		Double sum2 = menu.stream().filter(d -> d.isVegetarian()).mapToDouble(Dish::getCalories).sum();
		System.out.println("sum 1: " + sum1);
		System.out.println("sum 2: " + sum2);

	}

	private static <T, R> Predicate<T> distinctBy(Function<T, R> func) {
		Set<R> noDup = new HashSet<>();
		return t -> noDup.add(func.apply(t));
	}

	private static List<Dish> getAll() {
		return Arrays.asList(new Dish("1", "D1", 308, Kind.FEAT, false), new Dish("2", "D2", 105, Kind.OTHER, true),
				new Dish("3", "D3", 329, Kind.OTHER, true), new Dish("4", "D4", 302, Kind.MEAT, false),
				new Dish("5", "D5", 480, Kind.MEAT, true), new Dish("6", "D6", 480, Kind.MEAT, true),
				new Dish("7", "D7", 480, Kind.MEAT, true));
	}
}
