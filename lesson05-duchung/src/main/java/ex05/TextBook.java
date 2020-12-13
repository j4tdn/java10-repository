package ex05;

public class TextBook {
	private String ipBook;
	private double price;
	private String publishingCompany;
	private String status;
	public TextBook() {
	}
	public String getIpBook() {
		return ipBook;
	}
	
	public TextBook(String ipBook, double price, String publishingCompany, String status) {
		super();
		this.ipBook = ipBook;
		this.price = price;
		this.publishingCompany = publishingCompany;
		this.status = status;
	}
	public void setIpBook(String ipBook) {
		this.ipBook = ipBook;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPublishingCompany() {
		return publishingCompany;
	}
	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "TextBook [ipBook=" + ipBook + ", price=" + price + ", publishingCompany=" + publishingCompany
				+ ", status=" + status + "]";
	}
	public double giamgia() {
		if(status=="cu") 
			return price*0.3;
		return price;

	}
	

}
