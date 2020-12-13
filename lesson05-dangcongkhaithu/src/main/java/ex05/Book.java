package ex05;

public class Book {
	protected String id;
	protected double price;
	protected String publishingComp;

	public Book() {
	}

	public Book(String id, double price, String publishingComp) {
		this.id = id;
		this.price = price;
		this.publishingComp = publishingComp;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublishingComp() {
		return publishingComp;
	}

	public void setPublishingComp(String publishingComp) {
		this.publishingComp = publishingComp;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", price=" + price + ", publishingComp=" + publishingComp + "]";
	}

}
