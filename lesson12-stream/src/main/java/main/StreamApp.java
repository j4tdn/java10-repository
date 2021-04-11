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
		
		// 1 2 3 4 5
		// limit(2) => 1 2
		// skip(Stream.length - 2)
		List<String> result = menu.stream() // stream dish
		.filter(d -> d.getCalories() > 300) // Stream<Dish>
		.map(Dish::getName) // Stream<String>
		.skip(1) // Stream<String>
		.collect(Collectors.toList()); // List<String>
		
		result.forEach(System.out::println);
		
		// intermediate versus terminal operation
		// lazy loading
		long number = menu.stream() // Stream<Dish>
			.filter(d -> {
				System.out.println("filter: " + d.getName());
				return d.getCalories() > 300;
			}) // Stream<Dish>
			.map(d -> {
				System.out.println("map: " + d.getName());
				return d.getName();
			}) // Stream<String>
			.count();
		System.out.println(number);
		System.out.println("================================");
		
		Set<Double> noDupCalories = new HashSet<Double>();
		
		List<Dish> meatDishes = menu.stream()
			.filter(d -> Kind.MEAT.equals(d.getKind()))
			// .distinct() // override  hashcode, equals according to property which produce non-duplicatte results
			.filter(distinctBy(Dish::getCalories))
			.collect(Collectors.toList());
			meatDishes.forEach(System.out::println);
	}
	
	private static <T, R> Predicate<T> distinctBy(Function<T, R> func){
		Set<R> noDup = new HashSet<R>();
		return t -> noDup.add(func.apply(t));
	}
	private static List<Dish> getAll(){
		return Arrays.asList(new Dish("1", "D1", 308, Kind.MEAT, false),
				new Dish("2", "D2", 620, Kind.OTHER, true),
				new Dish("3", "D3", 329, Kind.OTHER, true),
				new Dish("4", "D4", 302, Kind.MEAT,false),
				new Dish("5", "D5", 480, Kind.MEAT,false),
				new Dish("6", "D6", 480, Kind.MEAT,false),
				new Dish("7", "D7", 818, Kind.MEAT,false));
	};
}
