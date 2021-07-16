package persistence;

import java.sql.Date;

public class Items {
	private Integer itemId;
	private String itemName;
	private Integer price;
	private Integer purchasePrice;
	private Integer itemGroupId;
	private Date timeOder;
	
	public Items() {
	}

	public Items(Integer itemId, String itemName, Integer price) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
		
	}
	
	

	public Items(Integer itemId, String itemName, Date timeOder) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.timeOder = timeOder;
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

	public Integer getItemGroupId() {
		return itemGroupId;
	}

	public void setItemGroupId(Integer itemGroupId) {
		this.itemGroupId = itemGroupId;
	}

	public Date getTimeOder() {
		return timeOder;
	}

	public void setTimeOder(Date timeOder) {
		this.timeOder = timeOder;
	}

	@Override
	public String toString() {
		if (price != null) {
			return "Mã mặt hàng: " + itemId + ", tên mặt hàng: " + itemName + ", giá bán: " + price;
		}
		return "Mã mặt hàng: " + itemId + ", tên mặt hàng: " + itemName + ", thời gian đặt hàng: " + timeOder;

	}
	
}
