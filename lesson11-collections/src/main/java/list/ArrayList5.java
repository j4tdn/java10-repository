package list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import bean.Item;

public class ArrayList5 {
	public static void main(String[] args) {
		List<Integer> digits = Arrays.asList(1, 2, 3, 4, 5, 6);	// static length
		Collections.reverse(digits);
		Collections.shuffle(digits);
		printf(digits);
		Collections.sort(digits);
		printf(digits);
		System.out.println("------------------");
		
		List<Item> items = Arrays.asList(new Item(7, "A"), new Item(3, "B"), new Item(5, "C"), new Item(7, "H"));
//		Collections.sort(items);
		printfItems(items);
		
//		Collections.sort(items, new Comparator<Item>() {
//
//			@Override
//			public int compare(Item i1, Item i2) {
//				return i1.getId().compareTo(i2.getId());
//			}
//		});
//		printfItems(items);
		
//		Collections.sort(items, (i1, i2) -> i1.getId().compareTo(i2.getId()));
//		printfItems(items);
		
		Collections.sort(items, Comparator.comparing((Item i) -> i.getId()).reversed());
		printfItems(items);
	}
	
	private static void printf(List<Integer> digits) {
		for (Integer digit : digits) {
			System.out.print(digit + " ");
		}
		System.out.println();
	}
	
	private static void printfItems(List<Item> items) {
		for (Item item : items) {
			System.out.println(item + " ");
		}
		System.out.println();
	}
}
