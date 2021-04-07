package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Predicate;
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
		
		//composing lambda expression
		Comparator<Apple> c1 = (ap1, ap2)->a1.getId() - a2.getId();
		Comparator<Apple> c2 = (ap1, ap2)->Double.compare(ap1.getWeight(), ap2.getWeight());
		
		inventory.sort(c1.thenComparing(c2));
		//relationship c1 with c2
		
		System.out.println("=============");
		
		//weight > 120 & color = red
		Predicate<Apple> redPredicate = a->"red".equals(a.getColor());
		Predicate<Apple> weightPredicate = a->a.getWeight()>120;
		
		//filter(inventory,redPredicate.negate()).forEach(System.out::println); get not color red
		filter(inventory,redPredicate.and(weightPredicate)).forEach(System.out::println); // merger 2 pr
		
		System.out.println("==============");
		
		Function<Integer, Integer> f = x -> x+2;
		Function<Integer, Integer> g = x -> x*2;
		// g(f(x))
		Function<Integer, Integer>  r =  f.andThen(g);
		//r = Function<Integer, Integer>  l =  g.compose(f);
		Integer digits =  r.apply(3);
		System.out.println("digits: " +digits);
		
		
		
	} 
	private static List<Apple> filter(List<Apple> inventory, Predicate<Apple> predicate){
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory) {
			if(predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
		
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