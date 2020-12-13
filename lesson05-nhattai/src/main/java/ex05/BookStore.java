package ex05;

public class BookStore {
	public static void main(String[] args) {
		TextBook textbook1 = new TextBook("SGK1", 10, "TNT", "new");
		TextBook textbook2 = new TextBook("SGK2", 20, "Tun", "old");
		TextBook textbook3 = new TextBook("SGK3", 30, "Hun", "new");
		ReferenceBooks renBooks1 = new ReferenceBooks("STK4", 40, "Quoc", "old");
		ReferenceBooks renbooks2 = new ReferenceBooks("STK5", 50, "Nguyen", "new");
		System.out.println(textbook1);
	}
}
