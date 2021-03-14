package map;

import java.util.HashMap;
import java.util.Map;

import bean.Item;

public class HashMapDemo2 {
	public static void main(String[] args) {
		// K: item
		// V: quantity
		Map<Item, Integer> items = new HashMap<>();
		items.put(new Item(1, "A"), 10);
		items.put(new Item(2, "B"), 20);
		items.put(new Item(2, "B"), 30);
		
		System.out.println(items.size());
		System.out.println(items.get(new Item(2, "B")));
	}
}
