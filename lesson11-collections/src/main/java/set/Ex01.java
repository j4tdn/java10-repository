package set;

import java.util.HashSet;
import java.util.Set;

import bean.Item;

public class Ex01 {
	public static void main(String[] args) {
		// set: Kiểm tra xem hashcode có trùng hay tồn tại hay ko
		// set tương đồng gần giống map
		// HashSet(), TreeSet(cho lưu phần tử trùng),LinkedHashSet(cho lưu trử phần tử trùng nhau)
		// Map<K,V>=> hashcode of K
		// Set<E> => hashcode of E
		Set<Item> items = new HashSet<>();
		items.add(new Item(1, "A"));
		items.add(new Item(1, "A"));
		System.out.println("size: " + items.size());
	}
}
