package set;

import java.util.HashSet;
import java.util.Set;

import bean.Item;

public class Ex01 {
	public static void main(String[] args) {
		Set<Item> items = new HashSet<>();
		items.add(new Item("A", 1));
		items.add(new Item("A", 1));
		System.out.println("size: " + items.size());
		
	}

}
