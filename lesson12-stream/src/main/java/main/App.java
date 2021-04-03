package main;

import java.util.ArrayList;
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
		  
		// anonymous function == lambda 
		// reference
		inventory.forEach( new Consumer<Apple>() {

			@Override
			public void accept(Apple apple) {
				System.out.println( apple);
				
			}
		});
		// t-> sout(t);
		inventory.forEach(System.out::println);
		// o1,o2 -> o1.getId() - o2.getID()  vi tra ve int
		
		// inventory.sort(Comparator.comparing(Apple::getId));
		
		// neu key trung nhau
		Map<Integer, Apple> map =  inventory.stream()
				.collect(Collectors.toMap(
						Apple::getId, // key mapper
						Function.identity(), // value mapper
						(a1,a2)-> a2, //merge
						LinkedHashMap::new)); // supplier
		
	System.out.println("=========================");
	for(Entry<Integer, Apple> entry: map.entrySet()) {
		System.out.println(entry);
	}
		
	// constructor reference
	Supplier<Apple> sup = Apple::new;
	Apple a1 = sup.get();
	
	//interf
	Function<String, Apple> fun= Apple::new;
	Apple a2 = fun.apply("green");
	
	}	
	
	private static List<Apple>getAll(){
	return 	 Arrays.asList(
			new Apple(1, "green", 200, "Viet Nam"),
			new Apple(22, "green", 300, "Viet Nam"), 
			new Apple(16, "red", 300, "Lao"), 
			new Apple(4, "green", 400, ""),
			new Apple(5, "green", 600, "Viet Nam"), 
			new Apple(6, "green", 100, "Viet Nam"));
	}
}