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
		
		List<String> temp = menu.stream() // Stream <Dish>
				.filter(d -> d.getCalories() > 300) // Stream <Dish>
				.map(Dish::getName) // Stream <String>
				.collect(Collectors.toList()); // List <String>
				
		List<String> result = temp.stream() // Stream <String>
				//.limit(1) ////skip element final
				.skip(temp.size()-3) //Stream <String> 
				.collect(Collectors.toList()); // List <String>
		         result.forEach(System.out::println);
		
		// stream print traversable
		         System.out.println("=========================");
		// intermediate operation versus terminal operation
		// 
		        long count = menu.stream()
		         	.filter(d -> {
		         		System.out.println("filter " +d.getName());
		         		return d.getCalories() > 300;
		         	}).map(d -> {
		         		System.out.println("map " + d.getName());
		         		return d.getName();
		         	})
		         	.limit(2)
		         	.count();
		        System.out.println("count: " +count);
		        
		// 
		        
		        System.out.println("===================");
		        List<Dish> meatDished =  menu.stream()
		        	 .filter(d->Kind.MEAT.equals(d.getKind()))
		        	//.distinct() // hashcode, equals according to property which produce 
		        	// cach 1 su dung distinct 
		        	.filter(distinctBy(Dish::getCalories))
		        	// cach 2 overide function distinct
		        	.collect(Collectors.toList());
		      
		      meatDished.forEach(System.out::println);
		        
		
	}
	
	private static <T, R> Predicate<T> distinctBy( Function<T, R> func) {
		Set<R> noDup = new HashSet<>();
		return t -> noDup.add(func.apply(t)); 
	}

	private static List<Dish> getAll() {
		return Arrays.asList(
				new Dish("1", "D1",620,Kind.MEAT, false), 
				new Dish("2", "D2",620,Kind.OTHER, false), 
				new Dish("3", "D3", 329,Kind.OTHER, true),
				new Dish("4", "D4", 302,Kind.MEAT, true), 
				new Dish("5", "D5", 480,Kind.MEAT, false),
				new Dish("6", "D6", 480,Kind.MEAT, true),
				new Dish("7", "D7", 480,Kind.MEAT, true))
				;
	}

}
