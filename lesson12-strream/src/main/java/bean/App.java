package bean;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.Apple;

public class App {
	public static void main(String[] args) {
		List<Apple> inventory = getAll();
		inventory.forEach(System.out::println);
		//inventory.sort(Comparator.comparing(Apple::getId));
		
		Map<Integer, Apple> map = inventory.stream().collect(Collectors.toMap(
				Apple::getId,	// keymapper
				Function.identity(),	// value mapper
				(a1, a2) -> a2,		//merge function
				LinkedHashMap::new));	//map supplier
		
		System.out.println("===========================");
		for(Entry<Integer, Apple> entry: map.entrySet()) {
			System.out.println(entry);
		}
		
		//contructor reference
		Supplier<Apple> sup = Apple::new;
		Apple a1 = sup.get();
		
		//interfere
		Function<String, Apple> fun = Apple::new;
		Apple a2 = fun.apply("green");
	}							
		private static List<Apple> getAll(){		
			return Arrays.asList(
				new Apple(1, "green", 200, "Vietnam"),
				new Apple(2, "green", 300, "Vietnam"),
				new Apple(3, "red", 300, "Lao"),
				new Apple(4, "yellow", 400, "Thailand"),
				new Apple(5, "red", 600, "Vietnam"),
				new Apple(6, "green", 200, "ThaiLand"));
				
	}
}