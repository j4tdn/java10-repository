package list;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import bean.Item;

public class ArrayList4 {
	public static void main(String[] args) {
		List<Item> items = new ArrayList<>();
		items.add(new Item(1, "stamp"));
		items.add(new Item(2, "goods"));
		items.add(new Item(3, "electric"));
		
		System.out.println("size 1: " + items.size());
		
		items.remove(items.get(1));
		// Consider equals of Item
		items.remove(new Item(2, "goods"));
		
		Item existedItem = new Item(1, "stamp");
		
		System.out.println("constain: " + items.contains(existedItem));
		
		System.out.println("size 2: " + items.size());
		
		items.removeIf(item -> item != null && item.getId() != null && item.getId() > 2);
		System.out.println("size 3: " + items.size());
	}
}
