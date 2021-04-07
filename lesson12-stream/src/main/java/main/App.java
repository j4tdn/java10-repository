package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.Apple;

public class App {
	public static void main(String[] args) {
		List<Apple> inventory = Arrays.asList(new Apple(1, "green", 200, "Vietnam"),
				new Apple(1, "red", 100, "Thailan"), new Apple(1, "yellow", 300, "Lao"),
				new Apple(1, "green", 50, "Trungquoc"), new Apple(1, "red", 500, "Campuchia"),
				new Apple(1, "green", 300, "My"));

		inventory.forEach(new Consumer<Apple>() {
			@Override
			public void accept(Apple t) {
				System.out.println(t);
			}
		});
		inventory.sort(Comparator.comparing(Apple::getId));

		Map<Integer, Apple> map = inventory.stream()
				.collect(Collectors.toMap(Apple::getId, Function.identity(), (a1, a2) -> a2, HashMap::new));

		Predicate<Apple> redApple = a -> "red".equals(a.getColor());
		Predicate<Apple> weightApple = a -> a.getWeight() > 400;

		System.out.println("=====================================");
		filter(inventory, redApple.and(weightApple)).forEach(System.out::println);

		System.out.println("=====================================");

		Function<Integer, Integer> f = x -> x + 2;
		Function<Integer, Integer> g = x -> x + 3;
		Function<Integer, Integer> r = f.andThen(g);

		System.out.println("digit: " + r.apply(3));
	}

	private static List<Apple> filter(List<Apple> inventory, Predicate<Apple> predicate) {
		List<Apple> result = new ArrayList<Apple>();
		for (Apple apple : inventory) {
			if (predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
}
