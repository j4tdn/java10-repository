package ex05;

public class ReferenceBooks {
	private String idRB;
	private double price;
	private String publishingH;
	private String tax;

	public ReferenceBooks(String idRB, double price, String publishingH, String tax) {
		this.idRB = idRB;
		this.price = price;
		this.publishingH = publishingH;
		this.tax = tax;
	}

	public String getIdRB() {
		return idRB;
	}

	public void setIdRB(String idRB) {
		this.idRB = idRB;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublishingH() {
		return publishingH;
	}

	public void setPublishingH(String publishingH) {
		this.publishingH = publishingH;
	}

	public String getTax() {
		return tax;
	}

	public void setTax(String tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "ReferenceBooks [idRB=" + idRB + ", price=" + price + ", publishingH=" + publishingH + ", tax=" + tax
				+ "]";
	}
}
