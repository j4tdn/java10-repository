package lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import bean.Apple;

public class Ex01 {
	// Biểu thức lambda dùng để thay thế cho một FunctionalInterface
	public static void main(String[] args) {
		List<Apple> listApple = Arrays.asList(new Apple(1, "green", 200, "Vietnam"),
				new Apple(16, "red", 300, "Vietnam"),
				new Apple(22, "green", 300, "Laos"),
				new Apple(8, "green", 250, "Vietnam"),
				new Apple(4, "red", 200, "Thailand"));
		
		Comparator<Apple> c1 = (a1, a2) -> a1.getId() - a2.getId();
		Comparator<Apple> c2 = (a1, a2) -> Double.compare(a1.getWeight(), a2.getWeight());		
		listApple.sort(c1.thenComparing(c2));		// // thenComparing
		listApple.forEach(System.out::println);
		
		System.out.println("=====================");
		
		Predicate<Apple> pre1 = apple -> "green".equals(apple.getColor());
		Predicate<Apple> pre2 = apple -> apple.getWeight() == 300;
 		filterApple(listApple,  pre1.and(pre2) ).forEach(System.out::println);		// and && or && negate
		
 		System.out.println("=====================");
		
 		Function<Integer, Integer> f = x -> x + 2;
 		Function<Integer, Integer> g = x -> x * 3;
 		// g(f(x))
 		Function<Integer, Integer> r = f.andThen(g);	// compose && andThen
 		System.out.println(r.apply(2));
	}

	private static List<Apple> filterApple(List<Apple> inventory, Predicate<Apple> predicate) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
}
