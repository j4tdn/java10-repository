package exercises;

public class ItemInfo {
	private Item item;
	private int quantity;

	public ItemInfo() {
	}

	public ItemInfo(Item item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "[" + item.getId() + "-" + item.getCost() + "]" + "-" + getQuantity();
	}
}
