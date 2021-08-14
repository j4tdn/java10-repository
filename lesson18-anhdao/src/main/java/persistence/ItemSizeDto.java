package persistence;

public class ItemSizeDto {
	public static final String IG_ID="igId";
	public static final String IG_NAME="igName";
	public static final String IT_ID="itId";
	public static final String IT_NAME="itName";
	public static final String SALE="SalePrice";
	public static final String BUY="BuyPrice";
	public static final String Total_Amount="TotalAmount";

	private Integer igId;
	private String igName;
	private Integer itId;
	private String itName;
	private Double SalePrice;
	private Double BuyPrice;
	private Integer TotalAmount;
	
	public ItemSizeDto() {
	}
	
	public ItemSizeDto(Integer igId, String igName, Integer itId, String itName, Double salePrice, Double buyPrice,
			Integer totalAmount) {
		super();
		this.igId = igId;
		this.igName = igName;
		this.itId = itId;
		this.itName = itName;
		SalePrice = salePrice;
		BuyPrice = buyPrice;
		TotalAmount = totalAmount;
	}


	public Integer getIgId() {
		return igId;
	}

	public void setIgId(Integer igId) {
		this.igId = igId;
	}

	public String getIgName() {
		return igName;
	}

	public void setIgName(String igName) {
		this.igName = igName;
	}

	public Integer getItId() {
		return itId;
	}

	public void setItId(Integer itId) {
		this.itId = itId;
	}

	public String getItName() {
		return itName;
	}

	public void setItName(String itName) {
		this.itName = itName;
	}

	public Double getSalePrice() {
		return SalePrice;
	}

	public void setSalePrice(Double salePrice) {
		SalePrice = salePrice;
	}

	public Double getBuyPrice() {
		return BuyPrice;
	}

	public void setBuyPrice(Double buyPrice) {
		BuyPrice = buyPrice;
	}

	public Integer getTotalAmount() {
		return TotalAmount;
	}

	public void setTotalAmount(Integer totalAmount) {
		TotalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "ItemSizeDto [igId=" + igId + ", igName=" + igName + ", itId=" + itId + ", itName=" + itName
				+ ", SalePrice=" + SalePrice + ", BuyPrice=" + BuyPrice + ", TotalAmount=" + TotalAmount + "]";
	}

	
}
