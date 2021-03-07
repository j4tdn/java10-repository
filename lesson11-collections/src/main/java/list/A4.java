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

		System.out.println("size1 : " + items.size());
		Item exitsItem = new Item(1, "stamp");

		items.remove(new Item(2, "goods")); // consider equals of Item
		
		System.out.println("contains = " + items.contains(exitsItem));
		System.out.println("size2: " + items.size());
		// item id>=2 : optional
		items.removeIf(item -> item != null && item.getId()!=null && item.getId()>2);
		System.out.println("size3: " + items.size());
		
	}
}
