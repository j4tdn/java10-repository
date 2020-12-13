package ex05;

public class ReferBook {
	private String idBook;
	private double price;
	private String company;
	private String tax;
	
	public ReferBook() {

	}
	public ReferBook(String idBook, double price, String company, String tax) {
		this.idBook = idBook;
		this.price = price;
		this.company = company;
		this.tax = tax;
	}
	public String getIdBook() {
		return idBook;
	}
	public void setIdBook(String idBook) {
		this.idBook = idBook;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getTax() {
		return tax;
	}
	public void setTax(String tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "ReferBook [idBook=" + idBook + ", price=" + price + ", company=" + company + ", tax=" + tax + "]";
	}

}
