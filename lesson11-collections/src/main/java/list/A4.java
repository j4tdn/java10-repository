package list;

import java.util.ArrayList;
import java.util.List;

import bean.Item;

public class A4 {
	public static void main(String[] args) {

		List<Item> items = new ArrayList<>();
		items.add(new Item(null, "stamp"));
		items.add(new Item(2, "goods"));
		items.add(new Item(3, "electric"));

		System.out.println("size 1:   " + items.size());
		Item deadItem = new Item(2, "goods");

		Item existItem = new Item(1, "stamp");

		items.remove(deadItem);// consider equals of item

		System.out.println("contains:  " + items.contains(existItem));
		// items.remove(items.get(1));

		System.out.println("size 2:   " + items.size());
		
		//item id >= 2 :optional
	    
		items.removeIf(item -> item != null && item.getId()!= null && item.getId()>2);
		System.out.println("size 3 :" + items.size());
		

	}
}
