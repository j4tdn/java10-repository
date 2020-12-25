package ex05.book;

import java.util.Arrays;

public class BookDemo {

	public static void main(String[] args) {
		Book[] books = getAll();
		Book[] pubBook = getBooks(books, book -> "NXBND".equals(book.getPublisher()));
		Book[] lessBooks = getBooks(books, book -> book.getPrice() < 50);
		Book[] betweenBook = getBooks(books, book -> book.getPrice() >= 30 && book.getPrice() <= 60);

		printf(pubBook);
		System.out.println("================");
		printf(lessBooks);
		System.out.println("================");
		printf(betweenBook);

	}

	// strategy pattern => lambda, functional interface
	private static Book[] getBooks(Book[] books, BookBehavior strategy) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book book : books) {
			if (strategy.test(book)) {
				result[count++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static void printf(Book[] books) {
		for (Book book : books) {
			System.out.println(book);
		}
	}

	private static Book[] getAll() {
		Book t1 = new TextBook("SGK-A", 20, "BGDVN", true);
		Book t2 = new TextBook("SGK-B", 12, "NXBND", false);
		Book t3 = new TextBook("SGK-C", 32, "BGDLV", true);

		Book r1 = new ReferenceBook("STK-X", 40, "NXBND", 7);
		Book r2 = new ReferenceBook("STK-K", 38, "NXBND", 7);

		return new Book[] { t1, t2, t3, r1, r2 };
	}

}
