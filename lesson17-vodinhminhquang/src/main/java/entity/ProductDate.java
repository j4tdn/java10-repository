package entity;

public class ProductDate {

	private String ProductName;
	private String date;

	public ProductDate(String productName, String date) {
		ProductName = productName;
		this.date = date;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "ProductDate [ProductName=" + ProductName + ", date=" + date + "]";
	}

}
