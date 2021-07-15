package persistence;

public class ItemGroup {
	private Integer id;
	private String name;
	private Integer price;

	public ItemGroup() {
		// TODO Auto-generated constructor stub
	}

	public ItemGroup(Integer id, String name, Integer price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public ItemGroup(int id, String name) {
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

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}