package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Ex03 {
	public static void main(String[] args) {
		Item[] items = getItems();
//		Arrays.sort(items);
		
		//comparator
		Function<Item, Integer> func = i -> i.getAge();
		Arrays.sort(items, Comparator.comparing((Item i) -> i.getName()).thenComparing((Item i) -> i.getAge()));
		
		for (Item item : items) {
			System.out.println(item);
		}


	}

	private static Item[] getItems() {
		return new Item[] { new Item(1, "Adam", 20), new Item(2, "Born", 19), new Item(3, "Cell", 27),
				new Item(4, "Adam", 18) };
	}

	private static class Item {
		private Integer id;
		private String name;
		private Integer age;

		@Override
		public String toString() {
			return id + " , " + name + " , " + age;
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

		public Item(Integer id, String name, Integer age) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
		}

//		@Override
//		public int compareTo(Item o) {
//			// TODO Auto-generated method stub
//			String n1 = getName();
//			String n2 = o.getName();
//			
//			if (n1.equals(n2)) {
//				return getAge().compareTo(o.getAge());
//			}
//			
//			return n1.compareTo(n2);
//		}

	}

}
