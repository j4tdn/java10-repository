package lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.Apple;

public class Ex01 {
	// Biểu thức lambda dùng để thay thế cho một FunctionalInterface
	public static void main(String[] args) {
		List<Apple> listApple = Arrays.asList();
		
		List<Apple> result = filterApple(listApple, apple -> apple.getColor().equals("green") && apple.getWeight() == 12);
		
		for (Apple apple : result) {
			System.out.println(apple);
		}
		
	}

	private static List<Apple> filterApple(List<Apple> inventory, ApplePredicate predicate) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
}
