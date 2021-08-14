package persistence;

import java.sql.Time;

public class ItemDto {
	public static final String ITEM_ID = "itemID";
	public static final String ITEM_NAME = "itemName";
	public static final String ODER_TIME = "oderTime";
	private Integer itemID;
	private String itemName;
	private Time oderTime;

	public ItemDto() {
		// TODO Auto-generated constructor stub
	}

	public ItemDto(Integer itemID, String itemName, Time time) {
		super();
		this.itemID = itemID;
		this.itemName = itemName;
		this.oderTime = time;
	}

	public Integer getItemID() {
		return itemID;
	}

	public void setItemID(Integer itemID) {
		this.itemID = itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setOderTime(Time oderTime) {
		this.oderTime = oderTime;
	}

	public Time getOderTime() {
		return oderTime;
	}

	@Override
	public String toString() {
		return "ItemDto [itemID=" + itemID + ", itemName=" + itemName + ", oderTime=" + oderTime + "]";
	}

}
