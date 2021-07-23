package persistence;

// Như này cũng được. Như thường người ta ko làm như này

// Class: Item chứa các thuộc tính của table MatHang
// Class: ItemGroup chứa các thuộc tính của table LoaiHang

// 1 LoaiHang có n MatHang
// 1 MatHang thuộc 1 LoaiHang >> Để 2 thằng này liên kết trong code JAVA

// Thì bên class Item : Em cho thêm 1 thuộc tính là ItemGroup itemGroup
//     bên class ItemGroup: Em cho thêm 1 thuộc tính là List<Item> items

// Khi đó query trả về e trả về List<Item> trong Item có ItemGroup
// Hoặc List<ItemGroup> trong ItemGroup có List<Items>

// A đang explain cho câu 4
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
