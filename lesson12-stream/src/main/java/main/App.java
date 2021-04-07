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
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import bean.Apple;

public class App {
	public static void main(String[] args) {
		List<Apple> inventory = getAll();

		inventory.forEach(System.out::println);
		inventory.sort(Comparator.comparing(Apple::getId));

		// Supplier<LinkedHashMap<Integer, Apple>> sup = () -> new LinkedHashMap<>();

		Map<Integer, Apple> map = inventory.stream()
				.collect(Collectors.toMap(Apple::getId, Function.identity(), (a1, a2) -> a2, LinkedHashMap::new));
		System.out.println("-------------------");
		for (Entry<Integer, Apple> entry : map.entrySet()) {
			System.out.println(entry);
		}

		inventory.stream().collect(Collectors.toMap(Apple::getId, Function.identity()));

		// constructor reference
		Supplier<Apple> sup = Apple::new;
		Apple a1 = sup.get();

		// interface
		Function<String, Apple> fun = Apple::new;
		Apple a2 = fun.apply("green");
		// composing lambda expression
		Comparator<Apple> c1 = (ap1, ap2) -> ap1.getId() - ap2.getId();
		Comparator<Apple> c2 = (ap1, ap2) -> Double.compare(ap1.getWeight(), ap2.getWeight());
		inventory.sort(c1.thenComparing(c2));

		// weight
		Predicate<Apple> redApplePre = a -> "red".equals(a.getColor());
		Predicate<Apple> weightApplePre = a -> a.getWeight() > 400;

		System.out.println("============");
		filter(inventory, redApplePre.and(weightApplePre)).forEach(System.out::println);
		
		System.out.println("==============");
		Function<Integer, Integer> f = x-> x+2;
		Function<Integer, Integer> g = x-> x*3;
		
		//g(f(x))
		Function<Integer, Integer> r= f.andThen(g);
		Integer digit = r.apply(3);
		System.out.println("digit: " +digit);

	}

	private static List<Apple> filter(List<Apple> inventory, Predicate<Apple> predicate) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

	private static List<Apple> getAll() {
		return Arrays.asList(new Apple(1, "green", 200, "Vietnam"), new Apple(2, "green", 300, "Vietnam"),
				new Apple(3, "red", 300, "Lao"), new Apple(4, "yellow", 400, "Thailand"),
				new Apple(5, "red", 600, "Vietnam"), new Apple(6, "green", 100, "Thailand"));
	}
}
