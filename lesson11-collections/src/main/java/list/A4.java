package list;

import java.util.ArrayList;
import java.util.List;
import bean.Item;

public class A4 {
	public static void main(String[] args) {
		List<Item> items = new ArrayList<Item>();
		items.add(new Item(1, "stamp"));
		items.add(new Item(2, "goods"));
		items.add(new Item(3, "electric"));
		System.out.println("size1: " + items.size());

		Item deadIteam = new Item(2, "goods");
		Item exitIteam = new Item(1, "stamp");

		items.remove(deadIteam); // consider equals of Item
		System.out.println("contains: " + items.contains(exitIteam));
		System.out.println("size2: " + items.size());

		// item id>=2: optional
		items.removeIf(item -> item != null && item.getId() != null && item.getId() > 2);

		System.out.println("size3: " + items.size());
	}
}
