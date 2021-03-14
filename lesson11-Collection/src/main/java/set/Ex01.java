package set;

import java.util.HashSet;
import java.util.Set;

import bean.Item;

public class Ex01 {
	public static void main(String[] args) {
		//HashSet, TreeSet, LinkedHashSet
		// Map<K,V> => hashcode of k
		// Set<E> => Hashcode Of E
		Set<Item> items = new HashSet<>();
		items.add(new Item("A", 1));
		items.add(new Item("A", 1));
		System.out.println("size: " + items.size());
	}
}
