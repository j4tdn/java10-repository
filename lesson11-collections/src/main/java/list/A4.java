package list;

import java.util.ArrayList;
import java.util.List;

import bean.Item;

public class A4 {
	public static void main(String[] args) {
		List<Item> items = new ArrayList<>();
		items.add(new Item(1, "stamp"));
		items.add(new Item(2, "goods"));
		items.add(new Item(3, "electric"));

		System.out.println("size1:" + items.size());

		Item deadItem = new Item(2, "goods");
		Item existItem = new Item(1, "stamp");

		items.remove(deadItem);
		System.out.println("contains: " + items.contains(existItem));
		System.out.println("size2:" + items.size());

		items.removeIf(item -> item != null && item.getId() != null && item.getId() > 2);
	}
}