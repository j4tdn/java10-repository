package ex05.book;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class BookDemo {
	// Tìm toàn bộ sách thuộc nhà xuất bản Nhi Đồng
	// Tìm toàn bộ sách có đơn giá nhỏ hơn 50
	// Tìm toàn bộ sách giáo khoa có đơn giá từ 100 đến 200
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance(Locale.FRANCE);
		c.set(1968, 1, 1);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf.setTimeZone(TimeZone.getTimeZone("Europe/Berlin"));
		System.out.println(sdf.format(c.getTime()));
		System.out.println("fdow: " + c.getFirstDayOfWeek());
		System.out.println("epoch: " + c.getTimeInMillis());
		
		Book[] books = getAll();
		Book[] pubBooks = getBooks(books, book -> "NXBND".equals(book.getPublisher()));
		Book[] lessBooks = getBooks(books, book -> book.getPrice() < 50);
		Book[] betweenBooks = getBooks(books, book -> book.getPrice() >= 30 && book.getPrice() <= 60);
		
		printf(pubBooks);
		System.out.println("================");
		printf(lessBooks);
		System.out.println("================");
		printf(betweenBooks);
	}

	// strategy pattern => lambda, functional interface
	// strategy: Book => true/false by condition
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
