package immutable.demo;

public class Ex02 {
public static void main(String[] args) {
	// kiem tra ki tu bat dau ket thuc 
	String[] books = {"SGK123","SGK234-KM","STK345","STK456"};
	for (String book: books) {
		System.out.println(book + "is TextBook: " + (book.startsWith("SGK")));
		System.out.println(book + "is SaleOff: " + (book.endsWith("KM")));
		// Thay the chuoi s1 = s2
		String s = "Hello Nam";
		String replaced = s.replace("Hello", "Hi");
		System.out.println("s: " +s );
		System.out.println("s: " + replaced );
		// cat dau cat cuoi
		String redundantSpaces = "Cheers   form   Viet  Nam ";
		String removed = redundantSpaces.trim().replaceAll("\\s+", " ");
		System.out.println(" s1: " +redundantSpaces );
		System.out.println("s2: " +removed);
		// cat chuoi
		String parent = "abcdefgh";
		String child = parent.substring(1,3);
		String generation = "xyz";
		System.out.println("child: " + child);
		System.out.println("contains 01: " + parent.contains(child)); //c1
		System.out.println("contains 02: " + (parent.indexOf(child) != -1)); // c2
		System.out.println("contains 01: " + parent.contains(generation)); //c1
		System.out.println("contains 02: " + (parent.indexOf(generation) != -1));
	}
}
}
