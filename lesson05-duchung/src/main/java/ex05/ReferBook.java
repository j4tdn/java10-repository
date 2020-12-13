package ex05;

public class ReferBook {
   private String ipReferBook;
	private double price;
	private String publishingCompany;
	private double tax;
	private double money;
	public ReferBook() {
		// TODO Auto-generated constructor stub
	}
	public ReferBook(String ipReferBook, double price, String publishingCompany, double tax) {
		super();
		this.ipReferBook = ipReferBook;
		this.price = price;
		this.publishingCompany = publishingCompany;
		this.tax = tax;
	}
	public String getIpReferBook() {
		return ipReferBook;
	}
	public void setIpReferBook(String ipReferBook) {
		this.ipReferBook = ipReferBook;
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
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public double getMoney() {
		return price*(1+ tax/100);
	}
	@Override
	public String toString() {
		return "ReferBook [ipReferBook=" + ipReferBook + ", price=" + price + ", publishingCompany=" + publishingCompany
				+ ", tax=" + tax + "]";
	}
	
	
	
   
}
