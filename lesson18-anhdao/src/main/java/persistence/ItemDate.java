package persistence;

import java.time.LocalTime;

public class ItemDate {
	public static final String ID= "itemId";
	public static final String NAME= "itemName";
	public static final String TIME= "orderTime";
	
	private Integer itemId;
	private String itemName;
	private LocalTime orderTime;
	
	public ItemDate() {
	}

	public ItemDate(Integer itemId, String itemName, LocalTime orderTime) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.orderTime = orderTime;
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

	public LocalTime getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(LocalTime orderTime) {
		this.orderTime = orderTime;
	}

	@Override
	public String toString() {
		return "ItemDate [itemId=" + itemId + ", itemName=" + itemName + ", orderTime=" + orderTime + "]";
	}
	
}
