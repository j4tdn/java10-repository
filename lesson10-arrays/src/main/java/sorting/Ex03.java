package sorting;

import java.util.Arrays;
import java.util.Comparator;

public class Ex03 {
	public static void main(String[] args) {
		Item[] items = getItems();
		
		// 1 parameter: T implements Comparable
		// restriction: 1 function sort allow
		//Arrays.sort(items);
		
		// Comparator
		
		Arrays.sort(items, Comparator.comparing((Item i) -> i.getName())
				.thenComparing((Item i) -> i.getAge()));
		for(Item item:items) {
			System.out.println(item);
		}
	}
	
	private static Item[] getItems() {
		return new Item[] {
				new Item(1, " TNT ", 20),
				new Item(2, " Jace ", 18),
				new Item(3, " TNT ", 22),
				new Item(4, " Ryze ", 25)
		};
	}
	
	private static class Item{
		private Integer id;
		private String name;
		private Integer age;
		
		public Item() {
		}

		public Item(Integer id, String name, Integer age) {
			super();
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
			return  id + ", " + name + "," + age ;
		}
	}
}
