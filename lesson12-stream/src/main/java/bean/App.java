package bean;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiFunction;
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
		
		  Map<Integer, Apple> map02 = inventory.stream()
		  .collect(Collectors.toMap(Apple::getId, // không trả về một interger, trả về một instance của functional interface một abstract class(.apply())
				  Function.identity(),
				  (o1, o2) -> o2,
				  LinkedHashMap::new));
		 
	
		for(Entry<Integer, Apple> entry : map.entrySet()) {
			System.out.println(entry);
		}
//		System.out.println("=====================");
//		for(Entry<Integer, Apple> entry02 : map02.entrySet()) {
//			System.out.println(entry02);
//		}
		System.out.println("=====================");
		System.out.println("=====================");
		// constructor reference
		Supplier<Apple> sup = new Supplier<Apple>() {
			@Override
			public Apple get() {
				return new Apple();
			}
		};
		Apple a1 = sup.get();
		System.out.println(a1);
		// interfere
		Function<String, Apple> sup2 = (String t) -> new Apple(t);
		Apple a2 = sup2.apply("green");
		System.out.println(a2);
		// 2 parameters
		BiFunction<String, String, Apple> biFunc = (String t1, String t2) -> new Apple(t1, t2);
		Apple a3 = biFunc.apply("green", "Vietnam");
		System.out.println(a3);
		// 3 parameters
	}

	public static List<Apple> getAll() {
		return Arrays.asList(new Apple(11, "green", 200, "Vietnam"), new Apple(2, "green", 300, "Vietnam"),
				new Apple(9, "red", 300, "Lao"), new Apple(4, "yellow", 400, "Thailand"),
				new Apple(29, "red", 600, "Vietnam"), new Apple(6, "green", 100, "Thailand"));
	}
}
