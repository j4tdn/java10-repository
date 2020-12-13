package exercise05;

public class Textbook {
	private String bookId;
	private double price;
	private String publishingCompany;
	private String condition;

	public Textbook() {
	}
	

	public Textbook(String bookId, double price, String publishingCompany, String condition) {
		super();
		this.bookId = bookId;
		this.price = price;
		this.publishingCompany = publishingCompany;
		this.condition = condition;
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

	public String getPublishingCompany() {
		return publishingCompany;
	}

	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
