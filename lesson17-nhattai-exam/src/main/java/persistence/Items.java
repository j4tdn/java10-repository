package persistence;

import java.sql.Time;

public class Items {
	private Integer itemsID;
	private String itemsName;
	private Time orderTime;
	
	public Items() {
	}

	public Items(Integer itemsID, String itemsName, Time orderTime) {
		super();
		this.itemsID = itemsID;
		this.itemsName = itemsName;
		this.orderTime = orderTime;
	}

	public Integer getItemsID() {
		return itemsID;
	}

	public void setItemsID(Integer itemsID) {
		this.itemsID = itemsID;
	}

	public String getItemsName() {
		return itemsName;
	}

	public void setItemsName(String itemsName) {
		this.itemsName = itemsName;
	}

	public Time getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Time orderTime) {
		this.orderTime = orderTime;
	}

	@Override
	public String toString() {
		return "items [itemsID=" + itemsID + ", itemsName=" + itemsName + ", orderTime=" + orderTime + "]";
	}
	
	
}
