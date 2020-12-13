package ex05;

public class TextBook {
	private String idTB;
	private double price;
	private String publishingH;
	private String status;

	public TextBook(String idTB, double price, String publishingH, String status) {
		this.idTB = idTB;
		this.price = price;
		this.publishingH = publishingH;
		this.status = status;
	}

	public String getIdTB() {
		return idTB;
	}

	public void setIdTB(String idTB) {
		this.idTB = idTB;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TextBook [idTB=" + idTB + ", price=" + price + ", publishingH=" + publishingH + ", status=" + status
				+ "]";
	}

}
