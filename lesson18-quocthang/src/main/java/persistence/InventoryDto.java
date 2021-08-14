package persistence;

public class InventoryDto {

	public static final String ID = "id";
	public static final String NAME = "name";
	public static final String AMOUNT = "amount";

	private Integer id;
	private String name;
	private Integer amount;

	public InventoryDto() {

	}

	public InventoryDto(Integer id, String name, Integer amount) {
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
		return "InventoryDto [id=" + id + ", name=" + name + ", amount=" + amount + "]";
	}

}