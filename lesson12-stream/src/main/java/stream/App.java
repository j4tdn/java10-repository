package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import bean.Dish;

public class App {
	public static void main(String[] args) {
		// data source
		List<Dish> menu = getAll();
		
		menu.stream()							// Stream<Dish>
			.filter(d -> d.getCalories() > 300)	// Stream<Dish>
			.map(Dish::getName)					// Stream<String>
			.limit(2)							// Stream<String>
			.collect(Collectors.toList())		// List<String>
			.forEach(System.out::println);		// print
		
	}
	
	private static List<Dish> getAll() {
		return Arrays.asList(
				new Dish("1", "pork", 308, false),
				new Dish("2", "beef", 105, true),
				new Dish("3", "chicken", 329, true),
				new Dish("4", "dog", 302, false),
				new Dish("5", "meomeo", 480, true));
	}
}
