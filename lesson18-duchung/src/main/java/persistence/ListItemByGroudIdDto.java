package persistence;

import java.sql.Time;

public class ListItemByGroudIdDto {
	public static final String ID = "id";
	public static final String NAME = "name";
	public static final String ITEM_ID = "itemID";
	public static final String ITEM_NAME = "itemName";
	public static final String PRICE = "price";
	public static final String PURCHAS_PRICE = "purchasPrice";
	public static final String NUMBER = "number";

	private Integer id;
	private String name;
	private Integer itemID;
	private String itemName;
	private Double price;
	private Double purchasPrice;
	private Integer number;

	public ListItemByGroudIdDto() {
		// TODO Auto-generated constructor stub
	}

	public ListItemByGroudIdDto(Integer id, String name, Integer itemID, String itemName, Double price,
			Double purchasPrice, Integer number) {
		super();
		this.id = id;
		this.name = name;
		this.itemID = itemID;
		this.itemName = itemName;
		this.price = price;
		this.purchasPrice = purchasPrice;
		this.number = number;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getPurchasPrice() {
		return purchasPrice;
	}

	public void setPurchasPrice(Double purchasPrice) {
		this.purchasPrice = purchasPrice;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "ListItemByGroudIdDto [id=" + id + ", name=" + name + ", itemID=" + itemID + ", itemName=" + itemName
				+ ", price=" + price + ", purchasPrice=" + purchasPrice + ", number=" + number + "]";
	}

}
