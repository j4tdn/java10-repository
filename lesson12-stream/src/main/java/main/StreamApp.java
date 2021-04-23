package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
		
//		List<Dish> meatDishes = menu.stream()
//			.filter(d -> Kind.MEAT.equals(d.getKind())) // get meat
//			// .distinct() // override  hashcode, equals according to property which produce non-duplicatte results
//			.filter(distinctBy(Dish::getCalories)) // get meat that have none duplicate in calory
//			.collect(Collectors.toList());
//			meatDishes.forEach(System.out::println);
			
		
		System.out.println("=====================");	
//		List<Dish> noDuplicateDishes = menu.stream()
//				.filter(d -> Kind.MEAT.equals(d.getKind()))
//				.filter(distinctByNameAndCalories(Dish::getName, Dish::getCalories))
//				.collect(Collectors.toList());
//		noDuplicateDishes.forEach(System.out::println);
		List<Dish> test = menu.stream().filter(d -> Kind.MEAT.equals(d.getKind()))
				.filter(distinctByNameAndCalories(Dish::getName, Dish::getCalories))
				.collect(Collectors.toList());
		test.forEach(System.out::println);
		
		System.out.println("==================================");
		System.out.println("==================================");
		System.out.println("==================================");
		System.out.println("==================================");
		
		List<String> dishNames = menu.stream()
				.map(Dish::getName)
				.collect(Collectors.toList());
		dishNames.forEach(System.out::println);
		
		List<Integer> dishNameLengths = dishNames.stream()
												.map(String::length)
												.collect(Collectors.toList());
		dishNameLengths.forEach(System.out::println);
		
		System.out.println("==================================");
		System.out.println("==================================");
		List<String> words = Arrays.asList("Java8", "Lambda", "In", "Action");
		List<Integer> wordsLength = words.stream()
											.map(String::length)
											.collect(Collectors.toList());
		wordsLength.forEach(System.out::println);
		
		System.out.println("=================");
		System.out.println("=================");
		
		List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<Integer> list2 = Arrays.asList(4, 5, 6);
		List<Integer> list3 = Arrays.asList(7, 8, 9);
		
		List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);
		
		// Calculate sum of calories of vegetarian food dish
		System.out.println(menu.stream()
		.filter(d -> d.isVegetarian())
		.map(Dish::getCalories) // Stream<Double> --> have to use several functions in Stream<Double>, kinda limited
		.reduce(Double::sum).get());
		
		System.out.println(menu.stream()
				.filter(t -> t.isVegetarian())
				.map(Dish::getCalories) // Stream<Double>
				.mapToDouble(new ToDoubleFunction<Double>() {
					@Override
					public double applyAsDouble(Double value) {
						// d -> d
						// unboxing Double to double
						return value.doubleValue();
					}
				}) // DoubleStream
				.sum()
				);
		
		System.out.println(menu.stream()
				.filter(t -> t.isVegetarian())
				.mapToDouble(Dish::getCalories) //DoubleStream
				.boxed() // DoubleStream -> Stream<Double>
				.reduce(0D, Double::sum))
				;  
		
		System.out.println(menu.stream()
				.filter(d -> d.getKind().equals(Kind.OTHER))
				.mapToDouble(Dish::getCalories) // DoubleStream --> support various function for calculating process
				.sum()
				);
														
	}
		
	private static <T, R> Predicate<T> distinctBy(Function<T, R> func){
		Set<R> noDup = new HashSet<R>();
		return t -> noDup.add(func.apply(t)); // t ~ Dish apply T nghĩa là ở ngoài sẽ get theo properties nào thì mình sẽ apply cho thằng đấy
		// truyền vào t trả về r, noDup ở đây là source để trả về đúng attribute cần tìm
	}
	
	
	private static <T, R> Predicate<T> distinctByNameAndCalories(Function<T, R> func1, Function<T, R> func2){
		Set<R> menu = new HashSet<R>();
		// add vào theo tên --> lặp lại thì không lấy
		Predicate<T> pred1 = t -> menu.add(func1.apply(t));
		
		// add vào theo calories --> lặp lại thì không lấy
		Predicate<T> pred2 = t -> menu.add(func2.apply(t));
		
		Predicate<T> pred3 = pred1.and(pred2);
		return pred3; 
	}
	
	private static List<Dish> getAll(){
		return Arrays.asList(new Dish("1", "D1", 308, Kind.MEAT, false),
				new Dish("2", "D2", 620, Kind.OTHER, true),
				new Dish("3", "D3", 329, Kind.OTHER, true),
				new Dish("4", "D1", 308, Kind.MEAT, false),
				new Dish("5", "D5", 480, Kind.MEAT, false),
				new Dish("6", "D6", 308, Kind.MEAT, false),
				new Dish("7", "D5", 480, Kind.MEAT, false));
	};
}
