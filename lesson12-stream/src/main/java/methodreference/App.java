package methodreference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import bean.Apple;

public class App {
	public static void main(String[] args) {
		List<Apple> inventory = getAll();
		
		// anonymous class 
//		inventory.forEach(new Consumer<Apple>() {
//
//			@Override
//			public void accept(Apple a) {
//				System.out.println(a);
//			}
//		});
		
		// anonymous function = lambda
//		inventory.forEach((Apple a) -> System.out.println(a));
		
		// method reference
		inventory.forEach(System.out::println);
		
//		inventory.sort(Comparator.comparing(Apple::getId));
		
		Map<Integer, Apple> map = inventory.stream().
				collect(Collectors.toMap(
						Apple::getId, 
						Function.identity(), 
						(a1, a2) -> a2, 
						LinkedHashMap::new));
		
		for (Entry<Integer, Apple> apple : map.entrySet()) {
			System.out.println(apple);
		}
	}
	
	private static List<Apple> getAll() {
		return Arrays.asList(new Apple(1, "green", 200, "Vietnam"),
				new Apple(16, "red", 300, "Vietnam"),
				new Apple(22, "green", 300, "Laos"),
				new Apple(8, "green", 250, "Vietnam"),
				new Apple(4, "red", 200, "Thailand"));
	}
}
