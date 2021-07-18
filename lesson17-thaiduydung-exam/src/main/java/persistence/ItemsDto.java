package persistence;

import java.sql.Time;
import java.time.LocalTime;

public class ItemsDto {
	private Integer groupId;
	private String groupName;
	private Integer itemId;
	private String itemName;
	private Integer price;
	private Integer purchasePrice;
	private Integer numbers;
	private LocalTime timeOder;

	public ItemsDto() {
		// TODO Auto-generated constructor stub
	}

	public ItemsDto(Integer itemId, String itemName, Time time) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.timeOder = LocalTime.of(time.getHours()-1, time.getMinutes(), time.getSeconds());
	}

	public ItemsDto(Integer groupId, String groupName, Integer itemId, String itemName, Integer price,
			Integer purchasePrice, Integer numbers) {
		this.groupId = groupId;
		this.groupName = groupName;
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
		this.purchasePrice = purchasePrice;
		this.numbers = numbers;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
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

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(Integer purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Integer getNumbers() {
		return numbers;
	}

	public void setNumbers(Integer numbers) {
		this.numbers = numbers;
	}

	public LocalTime getTimeOder() {
		return timeOder;
	}

	public void setTimeOder(LocalTime timeOder) {
		this.timeOder = timeOder;
	}

	@Override
	public String toString() {
		if (timeOder != null) {
			return "ItemsDto itemId=" + itemId + ", itemName=" + itemName + ", timeOder=" + timeOder + "]";
		}
		return "ItemsDto [groupId=" + groupId + ", groupName=" + groupName + ", itemId=" + itemId + ", itemName="
				+ itemName + ", price=" + price + ", purchasePrice=" + purchasePrice + ", numbers=" + numbers + "]";
	}

}
