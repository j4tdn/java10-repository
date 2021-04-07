package main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import bean.Dish;

public class StreamApp {
	public static void main(String[] args) {
		// data source
		List<Dish> menu = getAll();
		
		// 1 2 3 4 5 
		// limit(2) => 1, 2
		// skip(length - 2)
		List<String> temp = menu.stream()			// Stream<Dish>
			.filter(d -> d.getCalories() > 300)		// stream
			.map(Dish::getName)						// d -> d.getName()
//			.limit(2)								// Stream<String>
			.collect(Collectors.toList());
		
		List<String> result = temp.stream() 		// Stream<String>
				.skip(temp.size() - 3)  			// Stream<String>
				.collect(Collectors.toList());
		
		result.forEach(System.out::println);
		
	}
	
	private static List<Dish> getAll() {
		return Arrays.asList(new Dish("1", "pork", 308, false),
			new Dish("2", "beef", 105, true),
			new Dish("3", "chicken", 329, true),
			new Dish("4", "dog", 302, false),
			new Dish("5", "meomeo", 480, true));
	}

}
