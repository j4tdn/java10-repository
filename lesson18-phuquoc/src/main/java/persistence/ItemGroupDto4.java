package persistence;

public class ItemGroupDto4 {
	public static final String IDCATEGORY = "idCategory";
	public static final String NAMECATEGORY = "nameCategory";
	public static final String IDITEM = "idItem";
	public static final String NAMEITEM = "nameItem";
	public static final String PRICESELL = "priceSell";
	public static final String PRICEBUY = "priceBuy";
	public static final String TOTAL = "total";
	
	private Integer idCategory;
	private String nameCategory;
	private Integer idItem;
	private String nameItem;
	private Integer priceSell;
	private Integer priceBuy;
	private Integer total;
	
	public ItemGroupDto4() {
	}

	public ItemGroupDto4(Integer idCategory, String nameCategory, Integer idItem, String nameItem, Integer priceSell,
			Integer priceBuy, Integer total) {
		super();
		this.idCategory = idCategory;
		this.nameCategory = nameCategory;
		this.idItem = idItem;
		this.nameItem = nameItem;
		this.priceSell = priceSell;
		this.priceBuy = priceBuy;
		this.total = total;
	}

	public Integer getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(Integer idCategory) {
		this.idCategory = idCategory;
	}

	public String getNameCategory() {
		return nameCategory;
	}

	public void setNameCategory(String nameCategory) {
		this.nameCategory = nameCategory;
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

	public Integer getPriceSell() {
		return priceSell;
	}

	public void setPriceSell(Integer priceSell) {
		this.priceSell = priceSell;
	}

	public Integer getPriceBuy() {
		return priceBuy;
	}

	public void setPriceBuy(Integer priceBuy) {
		this.priceBuy = priceBuy;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "ItemGroupDto4 [idCategory=" + idCategory + ", nameCategory=" + nameCategory + ", idItem=" + idItem
				+ ", nameItem=" + nameItem + ", priceSell=" + priceSell + ", priceBuy=" + priceBuy + ", total=" + total
				+ "]";
	}
	
}
