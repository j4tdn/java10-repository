package persistence;

public class Inventory {
	private Integer id;
	private String name;
	private Integer amount;
	
	public Inventory() {
	}

	public Inventory(Integer id, String name, Integer amount) {
		super();
		this.id = id;
		this.name = name;
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

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Inventory [MaLoai=" + id + ", TenLoai=" + name + ", SoLuong=" + amount + "]";
	}
	
}
