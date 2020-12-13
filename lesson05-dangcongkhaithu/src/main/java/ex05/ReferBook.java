package ex05;

public class ReferBook extends Book {
	private double tax;

	

	public ReferBook() {
		super();
	}

	public ReferBook(String id, double price, String publishingComp, double tax) {
		super(id, price, publishingComp);
		this.tax = tax;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "ReferBook [id=" + id + ", price=" + price + ", publishingComp=" + publishingComp + ", tax=" + tax + "]";
	}

	

}
