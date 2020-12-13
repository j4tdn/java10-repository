package ex05;

public class Main {
	public static void main(String[] args) {
		Book[] books = { new TextBook("SGK01", 120, "NXB Tre", true),
				new TextBook("SGK02", 20, "NXB Kim Dong", false), new TextBook("SGK03", 190, "Nha Nam", true),
				new ReferBook("STK01", 5000, "VHVN", 0.02), new ReferBook("STK02", 6000, "Nhi Dong", 0.1) };
		
		getPublishingComp(books);
		System.out.println("==============");
		getPrice(books);
		System.out.println("=============");
		getPriceTextBook(books);
	}
	
	private static void getPublishingComp(Book[] books) {
		for(int i = 0; i < books.length;i++) {
			if("Nhi Dong".equals(books[i].getPublishingComp())) {
				System.out.println(books[i]);
			}
		}
	}
	
	private static void getPrice(Book[] books) {
		for(int i = 0; i < books.length;i++) {
			if(books[i].getPrice() < 50) {
				System.out.println(books[i]);
			}
		}
	}
	
	private static void getPriceTextBook(Book[] books) {
		for(int i = 0; i < books.length;i++) {
				if (books[i] instanceof TextBook) {
					TextBook textBook = (TextBook) books[i];
					if(textBook.getPrice() > 100 && textBook.getPrice() < 200) {
						System.out.println(textBook);
				}
			}
		}
	}
}
