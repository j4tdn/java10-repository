package persistence;

public class TopItem {
	public static final String TOP_ID = "id";
	public static final String TOP_NAME = "name";
	public static final String TOP_AMOUNT = "amount";

	private Integer id;
	private String name;
	private String amount;

	public TopItem(Integer id, String name, String amount) {
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

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "TopItem [id=" + id + ", name=" + name + ", amount=" + amount + "]";
	}

}
