package exercise05;

public class ReferBook extends Book{
	private double tax;

	public ReferBook(String bookId, double price, String publisher, double tax) {
		super(bookId, price, publisher);
		this.tax = tax;
	}
	
	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double cost() {
		return super.getPrice() * (1 + (tax / 100));
	}
}
