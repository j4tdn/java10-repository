package persistence;


public class ItemGroup {
	private Integer id;
	private String name;
	private Integer totalOfItem;

	public ItemGroup() {
		// TODO Auto-generated constructor stub
	}

	public ItemGroup(Integer id, String name, Integer totalOfItem) {
		super();
		this.id = id;
		this.name = name;
		this.totalOfItem = totalOfItem;
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

	public Integer getTotalOfItem() {
		return totalOfItem;
	}

	public void setTotalOfItem(Integer totalOfItem) {
		this.totalOfItem = totalOfItem;
	}

	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + ", totalOfItem=" + totalOfItem + "]";
	}
}
