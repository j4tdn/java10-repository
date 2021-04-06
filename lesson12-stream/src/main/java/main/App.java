package main;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import bean.Apple;

public class App {
	public static void main(String[] args) {
		List<Apple> inventory = getAll();
		
		// anonymous class
		// anonymous function = lambda
		// (parameters) -> {body}
		
//		Consumer<Apple> cons = new Consumer<Apple>() {
//			public void accept(Apple apple) {
//				System.out.println(apple);
//			}
//		};
//		
//		Consumer<Apple> conslabmda = (Apple a) -> {
//			System.out.println(a);
//		};
//		
//		Consumer<Apple> conslabmda1 = System.out::println;
//		
		inventory.forEach(System.out::println);
		// (o1, o2) -> o1.getId() - o2.getId()
//		inventory.sort(Comparator.comparing(Apple::getId));
		
//		Supplier<LinkedHashMap<Integer, Apple>> sup = 
//				LinkedHashMap::new; //() -> new LinkedHashMap<>()
		 
		Map<Integer, Apple> map = inventory.stream()
			.collect(Collectors.toMap(
					Apple::getId, 		// key mapper
					Function.identity(),// value mapper 
					(a1, a2) -> a2,		// merge function
					LinkedHashMap::new));				// map supplier
		 
		System.out.println("==========");
		for(Entry<Integer, Apple> entry: map.entrySet()) {
			System.out.println(entry);
		}
		
		
		// constructor reference
		// empty constructor
		Supplier<Apple> sup = Apple::new;
		Apple a1 = sup.get();
		
		Function<String, Apple> fun = Apple::new;
		Apple a2 = fun.apply("green");
		// one parameter - constructor
	} 
	
	private static List<Apple> getAll(){
		return Arrays.asList(
				new Apple(1, "green", 200, "VietNam"),
				new Apple(2, "green", 300, "VietNam"),
				new Apple(7, "red", 300, "Lao"),
				new Apple(4, "yellow", 400, "Thailand"),
				new Apple(5, "red", 600, "VietNam"),
				new Apple(6, "green", 100, "Thailand") 
				);
	}
}