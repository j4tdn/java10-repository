package list;

import java.util.ArrayList;

import java.util.List;

import bean.Item;

public class A4 {
	public static void main(String[] args) {
		List<Item> items = new ArrayList<>();
		items.add(new Item("stamp", 1));
		items.add(new Item("goods", 2));
		items.add(new Item("electric", 3));
		items.remove("stamp");
		System.out.println("size 1:" + items.size());
		Item deadItem = new Item("goods", 2);
		Item existItem = new Item("stamp", 1);

		System.out.println("contains: " + items.contains(existItem));
		// items.remove(deadItem);
		// item id > 2 : optinal
		System.out.println("size 2:" + items.size());
		// items.removeIf(item -> item != null &&item.getId()!= null && item.getId() >
		// 2);
		System.out.println("size 3:" + items.size());
	}

}
