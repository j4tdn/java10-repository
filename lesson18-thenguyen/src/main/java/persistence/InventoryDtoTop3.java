package persistence;

public class InventoryDtoTop3 {
	public static final String ID = "id";
	public static final String NAME = "name";
	public static final String TOTAL_AMOUNT = "totalAmount";
	
	private Integer id;
	private String name;
	private Integer totalAmount;
	
	public InventoryDtoTop3() {
	}

	public InventoryDtoTop3(Integer id, String name, Integer totalAmount) {
		super();
		this.id = id;
		this.name = name;
		this.totalAmount = totalAmount;
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

	public Integer getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "ItemGroupDto [id=" + id + ", name=" + name + ", totalAmount=" + totalAmount + "]";
	}
}
