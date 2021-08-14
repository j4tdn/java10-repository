package persistence;

public class ItemGroupDto2 {
	
	public static final String ID = "id";
	public static final String NAME = "name";
	public static final String TOTAL_AMOUNT = "totalAmount";
	
	private Integer id;
	private String name;
	private Integer totalAmount;
	
	public ItemGroupDto2() {
		// TODO Auto-generated constructor stub
	}

	public ItemGroupDto2(Integer id, String name, Integer totalAmount) {
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
		return "ItemGroupDto [MaLoai=" + id + ", TenLoai=" + name + ", totalAmount=" + totalAmount + "]";
	}
	
	
}
