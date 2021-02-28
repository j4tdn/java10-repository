package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Ex03 {
	public static void main(String[] args) {
		Item[] items = getItems();
		
		//Comparable
		//Arrays.sort(items);
		
		//Comparator
		//Function<Item, Integer> func = i -> i.getAge();
		Arrays.sort(items, Comparator.comparing((Item i) -> i.getName()).thenComparing((Item i) -> i.getAge()));
		
		for(Item item : items ) {
			System.out.println(item);
		}
	}
	
	private static Item[] getItems() {
		return new Item[] {
				new Item(1, "Khai Thu", 20),
				new Item(2, "Kin", 20),
				new Item(3, "Anh Thu", 20),
				new Item(4, "Na", 20)
		};
	}
	
	private static class Item /*implements Comparable<Item>*/ {
		private int id;
		private String name;
		private Integer age;
		
		public Item() {
			// TODO Auto-generated constructor stub
		}

		public Item(int id, String name, Integer age) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
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


		/*@Override
		public int compareTo(Item o) {
			// TODO Auto-generated method stub
			if(getName().equals(o.getName())) {
				return getAge().compareTo(o.getAge());
			}
			return getName().compareTo(o.getName());
		}*/
		
		
	}
}
