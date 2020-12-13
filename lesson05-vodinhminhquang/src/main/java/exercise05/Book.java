package exercise05;

public class Book {
	private String bookId;
	private double price;
	private String publisher;

	public Book(String bookId, double price, String publisher) {
		this.bookId = bookId;
		this.price = price;
		this.publisher = publisher;
	}

	public Book() {
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}
