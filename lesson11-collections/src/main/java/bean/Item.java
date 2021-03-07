package bean;

public class Item implements Comparable<Item> {
	private Integer id;
	private String name;

	public Item(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Item)) {

		}
		Item that = (Item) o;
		return getId().equals(that.getId()) && getName().equals(that.getName());
	}

	@Override
	public String toString() {
		return id + "," + name;
	}

	@Override
	public int compareTo(Item o) {
		if (getId().compareTo(o.getId()) == 0) {
			return getName().compareTo(o.getName());
		}
		return getId().compareTo(o.getId());
	}

}
