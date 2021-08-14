package persistence;

public class ItemTop3Dto {
	public static final String ITEM_NAME = "itemName";
	private String itemName;

	public ItemTop3Dto() {
		// TODO Auto-generated constructor stub
	}

	public ItemTop3Dto(String itemName) {
		super();
		this.itemName = itemName;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		return "ItemTop3Dto [itemName=" + itemName + "]";
	}

}
