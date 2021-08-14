package persistence;

public class ItemGroupDto {
	
	public static final String ID = "id";
	public static final String NAME = "name";
	public static final String ITEM_ID = "itemId";
	public static final String ITEM_NAME = "itemName";
	public static final String PRICE = "price";
	public static final String PURCHAS_PRICE = "purchasePrice";
	public static final String NUMBER = "amount";
	
	private Integer id;
	private String name;
	private Integer itemId;
	private String itemName;
	private Double price;
	private Double purchasePrice;
	private Integer amount;
	
	public ItemGroupDto() {

	}

	public ItemGroupDto(Integer id, String name, Integer itemId, String itemName, Double price, Double purchasePrice,
			Integer amount) {
		super();
		this.id = id;
		this.name = name;
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
		this.purchasePrice = purchasePrice;
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

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "ItemGroupDto [id=" + id + ", name=" + name + ", itemId=" + itemId + ", itemName=" + itemName
				+ ", price=" + price + ", purchasePrice=" + purchasePrice + ", amount=" + amount + "]";
	}
	
}
