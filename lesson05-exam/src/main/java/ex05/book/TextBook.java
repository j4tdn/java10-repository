package ex05.book;

public class TextBook extends Book{
	private boolean status;
	
	public TextBook() {
	}

	public TextBook(String id, double price, String publisher, boolean status) {
		super(id, price, publisher);
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
		return getId() + ", " + getPrice() 
					   + ", " + getPublisher() 
					   + ", " + isStatus();
		
	}
	
	
}
