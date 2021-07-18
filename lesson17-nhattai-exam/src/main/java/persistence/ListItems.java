package persistence;

public class ListItems {
	private Integer igroupId;
	private String iGroupName;
	private Integer itemId;
	private String itemName;
	private Integer price;
	private Integer purchasePrice;
	private Integer amount;


	public ListItems() {
	}


	public ListItems(Integer igroupId, String iGroupName, Integer itemId, String itemName, Integer price,
			Integer purchasePrice, Integer amount) {
		super();
		this.igroupId = igroupId;
		this.iGroupName = iGroupName;
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
		this.purchasePrice = purchasePrice;
		this.amount = amount;
	}


	public Integer getIgroupId() {
		return igroupId;
	}


	public void setIgroupId(Integer igroupId) {
		this.igroupId = igroupId;
	}


	public String getiGroupName() {
		return iGroupName;
	}


	public void setiGroupName(String iGroupName) {
		this.iGroupName = iGroupName;
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


	public Integer getAmount() {
		return amount;
	}


	public void setAmount(Integer amount) {
		this.amount = amount;
	}


	@Override
	public String toString() {
		return "ListItems [MaLoai=" + igroupId + ", TenLoai=" + iGroupName + ", MaMH=" + itemId + ", TenMH="
				+ itemName + ", GiaBan=" + price + ", GiaMua=" + purchasePrice + ", SoLuong=" + amount + "]";
	}

	
}
