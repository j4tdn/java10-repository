package bean;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		List<Apple> inventory = getAll();
		// anonymous class
		// anonymous function ~ lambda
		// inventory.forEach(t -> System.out.println(t));
		// Consumer<Apple> consumerLambda = System.out::println;
		// inventory.forEach(System.out::println);
		// inventory.sort(Comparator.comparing((Apple t) -> t.getId()));
		// inventory.sort(Comparator.comparing(Apple::getId));
		
		Map<Integer, Apple> map = inventory.stream()
				.collect(Collectors.toMap((Apple t) -> t.getId(), // key mapper
						(Apple t) -> t, // tra ve apple  // value mapper
						(o1, o2) -> o2, //merge function --> hai objects giong nhau thi lay cai nao
						() -> new LinkedHashMap<>())); 	// map supplier
		// case 2: with method reference and constructor reference
		/*
		 * Map<Integer, Apple> map02 = inventory.stream()
		 * .collect(Collectors.toMap(keyMapper, valueMapper, mergeFunction, mapFactory))
		 */
	
		for(Entry<Integer, Apple> entry : map.entrySet()) {
			System.out.println(entry);
		}
		
		// constructor reference
		Supplier<Apple> sup = Apple::new;
		Apple a1 = sup.get();
		// interfere
		Function<String, Apple> sup2 = Apple::new;
		Apple a2 = sup2.apply("green");
		
		System.out.println(a1);
		System.out.println(a2);
	}
	
	
	public static List<Apple> getAll(){
		return Arrays.asList(
						new Apple(11, "green", 200, "Vietnam"),
						new Apple(2, "green", 300, "Vietnam"),
						new Apple(9, "red", 300, "Lao"),
						new Apple(4, "yellow", 400, "Thailand"),
						new Apple(29, "red", 600, "Vietnam"),
						new Apple(6, "green", 100, "Thailand")
						);
	}
}
