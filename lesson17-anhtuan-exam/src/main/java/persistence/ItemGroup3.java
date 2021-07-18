package persistence;

public class ItemGroup3 {
	
	private Integer iGroupId;
	private String iGroupName;
	private Integer itemId;
	private String itemName;
	private Integer price;
	private Integer purchasePrice;
	private Integer amount;
	
	public ItemGroup3() {
		
	}

	public ItemGroup3(Integer iGroupId, String iGroupName, Integer itemId, String itemName, Integer price,
			Integer purchasePrice, Integer amount) {
		this.iGroupId = iGroupId;
		this.iGroupName = iGroupName;
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
		this.purchasePrice = purchasePrice;
		this.amount = amount;
	}

	public Integer getiGroupId() {
		return iGroupId;
	}

	public void setiGroupId(Integer iGroupId) {
		this.iGroupId = iGroupId;
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
		return "ItemGroup3 [MaLoai=" + iGroupId + ", TenLoai=" + iGroupName + ", MaMH=" + itemId + ", TenMH="
				+ itemName + ", GiaBan=" + price + ", GiaMua=" + purchasePrice + ", SoLuong=" + amount + "]";
	}
	
}
