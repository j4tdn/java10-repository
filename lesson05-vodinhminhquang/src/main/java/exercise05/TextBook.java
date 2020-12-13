package exercise05;

public class TextBook extends Book{

	private int status;
	
	public TextBook(String bookId, double price, String publisher, int status) {
		super(bookId, price, publisher);
		this.setStatus(status);
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	public double cost() {
		return super.getPrice() * 0.3;
	}
	
}
