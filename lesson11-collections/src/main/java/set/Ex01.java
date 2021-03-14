package set;

import java.util.HashSet;
import java.util.Set;

import bean.Item;

public class Ex01 {
	// HashSet, TreeSet, LinkedHashSet
	// Map<K,V> => hashCode of K
	// Set<E> => hashcode of E
	public static void main(String[] args) {
		Set<Item> items = new HashSet<>();
		items.add(new Item(1, "A"));
		items.add(new Item(1, "A"));
		System.out.println("size: " + items.size());

	}

}
