package sorting;

import java.util.Arrays;
import java.util.Comparator;

public class Ex03Item {
	public static void main(String[] args) {
		Item[] items = getItems();
		// 1 parameter: T implement Comparable
		// Han che: 1 function sort allow

//		Arrays.sort(items);

		
		Arrays.sort(items, Comparator.comparing((Item i) -> i.getName()).reversed());
		Arrays.sort(items, Comparator.comparing((Item i) -> i.getName()).thenComparing(Comparator.comparing((Item i) -> i.getAge())));
		for (Item item : items) {
			System.out.println(item);
		}
	}

	private static Item[] getItems() {
		return new Item[] { 
				new Item(1, "Huy", 21),
				new Item(2, "Quyen", 25),
				new Item(3, "Puang", 20),
				new Item(4, "Tai", 22),
				new Item(5, "Huy", 19)
		};
	}

	private static class Item implements Comparable<Item> {
		private Integer id;
		private String name;
		private Integer age;

		public Item() {
		}

		public Item(Integer id, String name, Integer age) {
			this.id = id;
			this.name = name;
			this.age = age;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "Item [id=" + id + ", name=" + name + ", age=" + age + "]";
		}

		@Override
		public int compareTo(Item o) {
			if (getName().equals(o.getName())) {
				return getAge().compareTo(o.getAge());
			}
			return getName().compareTo(o.getName());
		}
	}
}
