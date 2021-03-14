package map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Item;

public class Ex02 {
	public static void main(String[] args) {
		// item, quantity
		Item itemA = new Item("A", 1);
		Item itemB = new Item("A", 1);
		Map<Item, Integer> items = new HashMap<>();
		items.put(itemA, 10);
		items.put(itemB, 20);

		System.out.println("size: " + items.size());
		System.out.println("value: " + items.get(itemA));
		
		
	}
}
