package exercise05;

public class Main {
	public static void main(String[] args) {
		Book textbook1 = new TextBook("SGK01", 10000, "Nhi Đồng", 1);
		Book textbook2 = new TextBook("SGK02", 15000, "ABC", 0);
		Book textbook3 = new TextBook("SGK03", 25000, "Cánh buồm", 1);
		
		Book referBook1 = new ReferBook("STK01", 20000, "Cánh buồm", 3);
		Book referBook2 = new ReferBook("STK02", 22000, "ABC", 5);
		
		Book[] books = {textbook1, textbook2, textbook3, referBook1, referBook2};
	
	}
	
	public static String findingBook(Book findingbook, Book[] books) {
		String result = "";
		for(int i = 0; i < books.length; i++) {
			if(books[i].getPublisher().contains("Nhi Đồng")) {
				result = books[i].getBookId();
			}
		}
		return result;
	}
	public static Book priceLessThan50(Book findingbook, Book[] books) {
		Book lessThan50Book = new Book();
		for(int i = 0; i < books.length; i++) {
			if(books[i].getPrice() < 50) {
				lessThan50Book = books[i];
			}
		}
		return lessThan50Book;
	}
	
	public static Book pricebetween200and100(Book findingbook, Book[] books) {
		Book pricebetween200and100Book = new Book();
		for(int i = 0; i < books.length; i++) {
			if(books[i].getPrice() > 100 && books[i].getPrice() < 200) {
				pricebetween200and100Book = books[i];
			}
		}
		return pricebetween200and100Book;
	}
	
	
}
