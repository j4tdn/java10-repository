package ex05;

public class Textbook {
	private String idBook;
	private double price;
	private String company;
	private String status;
	public Textbook() {

	}
	public Textbook(String idBook, double price, String company, String status) {
		this.idBook = idBook;
		this.price = price;
		this.company = company;
		this.status = status;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Textbook [idBook=" + idBook + ", price=" + price + ", company=" + company + ", status=" + status + "]";
	}

}
