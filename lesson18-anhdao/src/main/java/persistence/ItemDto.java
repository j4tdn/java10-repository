package persistence;

public class ItemDto {
	public static final String IT_ID="itemId";
	public static final String IT_NAME="itemName";
	public static final String TotalAmount_ITEMS="TotalAmount";
	
	
	private Integer itemId;
	private String itemName;
	private Integer TotalAmount;
	
	public ItemDto() {
	}

	public ItemDto(Integer itemId, String itemName, Integer totalAmount) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		TotalAmount = totalAmount;
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

	public Integer getTotalAmount() {
		return TotalAmount;
	}

	public void setTotalAmount(Integer totalAmount) {
		TotalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "ItemDto [itemId=" + itemId + ", itemName=" + itemName + ", TotalAmount=" + TotalAmount + "]";
	}
	
}
