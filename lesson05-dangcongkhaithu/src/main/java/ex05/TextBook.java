package ex05;

public class TextBook extends Book {
	private boolean status;

	public TextBook() {
		super();
	}

	public TextBook(String id, double price, String publishingComp, boolean status) {
		super(id, price, publishingComp);
		this.status = status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TextBook [id=" + id + ", price=" + price + ", publishingComp=" + publishingComp
				+ ", status="+ status + "]";
	}

}
