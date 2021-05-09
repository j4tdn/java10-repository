package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import bean.Dish;
import bean.Dish.Kind;

public class StreamApp {
	public static void main(String[] args) {
		// data source
		List<Dish> menu = getAll();
		
		// 1 2 3 4 5
		// limit(2) => 1 2
		// skip(length - 2)
		List<String> temp = menu.stream() // Stream<Dish>
		    .filter(d -> d.getCalories() > 300) // Stream<Dish> 
	        .map(Dish::getName) // Stream<String>
	        .collect(Collectors.toList()); // List<String>
		
	    List<String> result = temp.stream() // Stream<String>
	    		.skip(temp.size() - 3) // Stream<String>
	            .collect(Collectors.toList()); // List<String>
		
		result.forEach(System.out::println);
		
		System.out.println("====================");
		// intermediate versus terminal operation
		// lazy
		long count = menu.stream() // Stream<Dish>
			.filter(d -> {
				System.out.println("filter " + d.getName());
				return d.getCalories() > 300;
			}) // Stream<Dish>
			.map(d -> {
				System.out.println("map " + d.getName());
				return d.getName();
			}) // Stream<String>
			.limit(2)
			.count();
		System.out.println("count: " + count);
		
		System.out.println("==================");
		// get MEAT dishes from initial menu 
		// and makes sure that there are no 
		// duplicates of calories
		
		List<Dish> meatDishes = menu.stream()
			.filter(d -> Kind.MEAT.equals(d.getKind()))
			// hashcode, equals according to 
			// property which produce non-duplicate
			// results
			.filter(distinctBy(Dish::getCalories))
			.collect(Collectors.toList());
		meatDishes.forEach(System.out::println);
	
		// Calculate sum of calories of vegie dishes
		double sum1 = menu.stream()
			.filter(d -> d.isVegetarian())
			.map(Dish::getCalories) // Stream<Double>
			.reduce(0d, Double::sum);
		
		double sum2 = menu.stream()
			.filter(d -> d.isVegetarian())
			.mapToDouble(Dish::getCalories) // DoubleStream
			.sum();
		
		System.out.println("sum 1: " + sum1);
		System.out.println("sum 2: " + sum2);
	}
	
	private static <T, R> Predicate<T> distinctBy(Function<T, R> func) {
		Set<R> noDup = new HashSet<>();
		return t -> noDup.add(func.apply(t)); 
	}
	
	private static List<Dish> getAll() {
		return Arrays.asList(new Dish("1", "D1", 308, Kind.FISH, false),
				new Dish("2", "D2", 620, Kind.OTHER, true),
				new Dish("3", "D3", 329, Kind.OTHER, true),
				new Dish("4", "D4", 302, Kind.MEAT, false),
				new Dish("5", "D5", 480, Kind.MEAT, false),
				new Dish("6", "D6", 480, Kind.MEAT, false),
				new Dish("7", "D7", 818, Kind.MEAT, false));
	}
}
