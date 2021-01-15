package immutable.demo;

public class Ex02 {
	public static void main(String[] args) {
		String[] books = {"SGK123", "SGK234-KM", "STK345", "STK456-KM"};
		for (String book : books) {
			System.out.println(book + " isTextbook: " + book.startsWith("SGK"));
			System.out.println(book + " isKM: " + book.endsWith("KM"));
		}
		
		// replace
		String s = "Hello Huy";
		String replaced = s.replace("Hello", "Hi");
		System.out.println(s);
		System.out.println(replaced);
		
		// trim
		String redundantSpaces = "    Cheer      from     viet nam";
		String removed = redundantSpaces.trim().replaceAll("\\s{1,}", " ");
		System.out.println(removed);
		
		// cắt chuỗi
		String parent = "abcdefgh";
		String child = parent.substring(1, 3);
		System.out.println(child);
	}
}
