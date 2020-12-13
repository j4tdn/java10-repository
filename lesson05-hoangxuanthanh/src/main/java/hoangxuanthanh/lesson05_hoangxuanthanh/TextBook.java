package hoangxuanthanh.lesson05_hoangxuanthanh;

public class TextBook {
	public String id;
	public int price;
	public String company;
	public String status;
	public TextBook(String id, int price, String company, String status) {
		super();
		this.id = id;
		this.price = price;
		this.company = company;
		this.status = status;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "TextBook [id=" + id + ", price=" + price + ", company=" + company + ", status=" + status + "]";
	}
	}
