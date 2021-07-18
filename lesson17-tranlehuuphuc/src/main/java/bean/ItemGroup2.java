package bean;

public class ItemGroup2 {
	private Integer id;
	private String name;
	private String list;
	private Integer amount;

	public ItemGroup2() {

	}

	public ItemGroup2(Integer id, String name, String list, Integer amount) {
		super();
		this.id = id;
		this.name = name;
		this.list = list;
		this.amount = amount;
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

	public String getList() {
		return list;
	}

	public void setList(String list) {
		this.list = list;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "ItemGroup3 [id=" + id + ", name=" + name + ", list=" + list + ", amount=" + amount + "]";
	}
}