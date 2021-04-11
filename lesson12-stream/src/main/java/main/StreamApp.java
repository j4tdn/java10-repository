package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import bean.Dish.Kind;

import bean.Dish;

public class StreamApp {
	public static void main(String[] args) {

		// data source
		List<Dish> menu = getAll();

		List<String> result = menu.stream().filter(d -> d.getCalories() > 300).map(Dish::getName).skip(1)
				.collect(Collectors.toList());

		result.forEach(System.out::println);

		// intermediate versus terminal operation
		System.out.println("===============");
		long count = menu.stream().filter(d -> {
			System.out.println("filter" + d.getName());
			return d.getCalories() > 300;
		}) // Stream<Dish>
				.map(d -> {
					System.out.println("map: " + d.getName());
					return d.getName();
				})// Stream<String>
				.limit(2).count();

		System.out.println("count: " + count);
		List<Dish> dishs = menu.stream()
		.filter(d -> Kind.MEAT.equals(d.getKind()))
		.distinct()
		.collect(Collectors.toList());
		
		dishs.forEach(System.out::println);
	}
	private static <R, T> Predicate<T> ditinctBy(Function<T, R> fun) {
		Set<R> noDup = new HashSet<>();
		return t-> noDup.add(fun.apply(t));
	}
		
	
	private static List<Dish> getAll() {
		return Arrays.asList(new Dish("1", "D1", 308, Kind.FISH, false),
				new Dish("2", "D2" , 642, Kind.FISH,false),
				new Dish("3", "D3" , 602, Kind.MEAT,true),
				new Dish("4", "D4" , 322, Kind.MEAT,false),
				new Dish("5", "D5" , 422, Kind.FISH,false));
	}
}
