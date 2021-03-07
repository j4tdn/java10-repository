package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import bean.Item;

public class A5 {
	public static void main(String[] args) {
		// static length
		List<Integer> digits = Arrays.asList(1, 2, 3, 4, 5);
		Collections.reverse(digits);
		Collections.shuffle(digits);
		Collections.sort(digits);
		printf(digits);
		
		List<Item> items = Arrays.asList(new Item( 7, "A"), new Item(3, "B"), new Item(4, "C"));
		Collections.sort(items);
		prinitfItems(items);
		System.out.println("============");
		List<Item> list = Arrays.asList(new Item(12, "Adam"), new Item(8, "Join"), new Item(19, "Hans"));
		Collections.sort(list, new Comparator<Item>() {
			@Override
			public int compare( Item i1, Item i2) {
				return i1.getId().compareTo(i2.getId());
			}
		});
		prinitfItems(list);
		System.out.println("===========");
	Collections.sort(list, Comparator.comparing((Item item) -> item.getId()).reversed());
		prinitfItems(list);
		
	}

	private static void printf(List<Integer> digits) {
		for (Integer digit : digits) {
			System.out.println(digit + " ");
		}
		System.out.println();
	}
private static void prinitfItems(List<Item> items) {
	for ( Item item: items) {
		System.out.println(item);
	}
	
}
}
