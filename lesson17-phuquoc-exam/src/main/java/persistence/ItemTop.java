package persistence;

public class ItemTop {
	private String itemName;
	public ItemTop() {
		// TODO Auto-generated constructor stub
	}
	public ItemTop(String itemName) {
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
		return "ItemTop [itemName=" + itemName + "]";
	}
	
}
