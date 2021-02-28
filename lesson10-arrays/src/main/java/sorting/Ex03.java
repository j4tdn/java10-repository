package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Ex03 {
	public static void main(String[] args) {
		Item[] items = getItems();
		// 1 parameter: T implements Comparable
		//restriction: 1 funtion sort allow
		//Arrays.sort(items);
		
		//Comparator
		Function<Item, Integer> func =i ->i.getAge();
		
		Arrays.sort(items,Comparator.comparing((Item i) -> i.getName()).thenComparing((Item i) -> i.getAge()));
		for (Item item : items) {
			System.out.println(item);
		}
	}

	private static Item[] getItems() {
		return new Item[] { new Item(1, "Adam", 20), new Item(2, "Born", 19), new Item(3, "Cell", 20),
				new Item(4, "Adam", 18) };
	}

	private static class Item  {
		private Integer id;
		private String name;
		private Integer age;

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
			return  id + ", " + name + ", " + age ;
		}

	}

}
