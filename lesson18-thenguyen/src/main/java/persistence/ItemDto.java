package persistence;

public class ItemDto {
	public static final String ID_ITEMGROUP = "idItemGroup";
	public static final String NAME_ITEMGROUP = "nameItemGroup";
	public static final String ID_ITEM = "idItem";
	public static final String NAME_ITEM = "nameItem";
	public static final String SALES_OUT = "salesOut";
	public static final String SALES_IN = "salesIn";
	public static final String TOTAL_AMOUNT = "totalAmount";

	private Integer idItemGroup;
	private String nameItemGroup;
	private Integer idItem;
	private String nameItem;
	private Double salesOut;
	private Double salesIn;
	private Integer totalAmount;

	public ItemDto() {

	}

	public ItemDto(Integer idItemGroup, String nameItemGroup, Integer idItem, String nameItem, Double salesOut,
			Double salesIn, Integer totalAmount) {
		super();
		this.idItemGroup = idItemGroup;
		this.nameItemGroup = nameItemGroup;
		this.idItem = idItem;
		this.nameItem = nameItem;
		this.salesOut = salesOut;
		this.salesIn = salesIn;
		this.totalAmount = totalAmount;
	}

	public Integer getIdItemGroup() {
		return idItemGroup;
	}

	public void setIdItemGroup(Integer idItemGroup) {
		this.idItemGroup = idItemGroup;
	}

	public String getNameItemGroup() {
		return nameItemGroup;
	}

	public void setNameItemGroup(String nameItemGroup) {
		this.nameItemGroup = nameItemGroup;
	}

	public Integer getIdItem() {
		return idItem;
	}

	public void setIdItem(Integer idItem) {
		this.idItem = idItem;
	}

	public String getNameItem() {
		return nameItem;
	}

	public void setNameItem(String nameItem) {
		this.nameItem = nameItem;
	}

	public Double getSalesOut() {
		return salesOut;
	}

	public void setSalesOut(Double salesOut) {
		this.salesOut = salesOut;
	}

	public Double getSalesIn() {
		return salesIn;
	}

	public void setSalesIn(Double salesIn) {
		this.salesIn = salesIn;
	}

	public Integer getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "Item [idItemGroup=" + idItemGroup + ", nameItemGroup=" + nameItemGroup + ", idItem=" + idItem
				+ ", nameItem=" + nameItem + ", salesOut=" + salesOut + ", salesIn=" + salesIn + ", totalAmount="
				+ totalAmount + "]";
	}

}
