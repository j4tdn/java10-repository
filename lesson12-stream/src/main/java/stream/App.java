package stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import bean.Dish;
import bean.Dish.Kind;

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
		
		// intermediate operation vs terminal operation
		menu.stream()
			.filter(d -> d.getCalories() > 300)
			.map(Dish::getName)
			.limit(2);
		
		// get MEAT dishes and make sure that there are no duplicates of calories
//		List<Dish> meatDishes = menu.stream()	
//							  .filter(d -> Kind.MEAT.equals(d.getKind()))
//							  .distinct()
//							  .collect(Collectors.toList());
//		meatDishes.forEach(System.out::println);
		
		List<Dish> meatDishes = menu.stream()	
				  .filter(d -> Kind.MEAT.equals(d.getKind()))
				  .filter(distinctBy(Dish::getCalories))
				  .collect(Collectors.toList());
		meatDishes.forEach(System.out::println);
	}
	
	private static List<Dish> getAll() {
		return Arrays.asList(
				new Dish("1", "D1", 308, Kind.FISH, false),
				new Dish("2", "D2", 405, Kind.OTHER, true),
				new Dish("3", "D3", 329, Kind.MEAT, true),
				new Dish("4", "D4", 302, Kind.MEAT, false),
				new Dish("5", "D5", 480, Kind.OTHER, true),
				new Dish("6", "D6", 329, Kind.MEAT, true),
				new Dish("7", "D7", 302, Kind.MEAT, false));
	}
	
	private static <T, R> Predicate<T> distinctBy(Function<T, R> func) {
		Set<R> noDup = new HashSet<>();
		return t -> noDup.add(func.apply(t));
	}
}
