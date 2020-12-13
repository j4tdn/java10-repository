package hoangxuanthanh.lesson05_hoangxuanthanh;

public class ReferBook {
	public String id;
	public int price;
	public String company;
	public long tax;
	public ReferBook(String id, int price, String company, long tax) {
		super();
		this.id = id;
		this.price = price;
		this.company = company;
		this.tax = tax;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public long getTax() {
		return tax;
	}
	public void setTax(long tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "ReferBook [id=" + id + ", price=" + price + ", company=" + company + ", tax=" + tax + "]";
	}
	
	
}
