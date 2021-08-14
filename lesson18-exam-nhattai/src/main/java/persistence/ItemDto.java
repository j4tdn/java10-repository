package persistence;

import java.sql.Time;

public class ItemDto {
	
	public static final String ITEM_ID = "itemId";
	public static final String ITEM_NAME = "itemName";
	public static final String ORDER_TIME = "orderTime";
	
	private Integer itemId;
	private String itemName;
	private Time orderTime;
	
	public ItemDto() {
	}

	public ItemDto(Integer itemId, String itemName, Time orderTime) {
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

	public Time getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Time orderTime) {
		this.orderTime = orderTime;
	}

	@Override
	public String toString() {
		return "ItemDto [itemId=" + itemId + ", itemName=" + itemName + ", orderTime=" + orderTime + "]";
	}
	
	
	
	

}
