package bean;

import java.util.Objects;

public class Item implements Comparable<Item> {
	private Integer id;
	private String name;

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

	public Item(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Item)) {
			return false;
		}
		Item that = (Item) o;
		return getId().equals(that.getId()) && getName().equals(that.getName());
	}

//	@Override
//	public int hashCode() {
//
//		return Objects.hash(getId(), getName());
//	}

	@Override
	public String toString() {
		return id + ", " + name;
	}

	@Override
	public int compareTo(Item o) {

		return getId().compareTo(o.getId());
	}

}