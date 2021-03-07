package list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import beans.Item;

public class A5 {
	public static void main(String[] args) {
		// static length
		List<Integer> digits = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println("size: " + digits.size());
		Collections.reverse(digits);
		Collections.shuffle(digits);

		Collections.sort(digits);

		printf(digits);

		List<Item> items = Arrays.asList(new Item(7, "A"), new Item(3, "B"), new Item(4, "C"));
		Collections.sort(items);
		printfItems(items);
		
		List<Item> list = Arrays.asList(new Item(12, "Adam"),
										new Item(8, "John"),
										new Item(10, "Hans"));
		
		Collections.sort(list, Comparator.comparing((Item item) -> item.getId()).reversed());
		printfItems(list);
	}

	private static void printf(List<Integer> digits) {
		for (Integer digit : digits) {
			System.out.println(digit + " ");
		}
		System.out.println();
	}
	
	private static void printfItems(List<Item> items) {
		for(Item item : items) {
			System.out.println(item);
		}
	}
}
