package exercise05;

public class ReferBook {
	private String bookId;
	private double price;
	private String publishingCompany;
	private int tax;

	public ReferBook() {
		// TODO Auto-generated constructor stub
	}
	
	

	public ReferBook(String bookId, double price, String publishingCompany, int tax) {
		super();
		this.bookId = bookId;
		this.price = price;
		this.publishingCompany = publishingCompany;
		this.tax = tax;
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

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
