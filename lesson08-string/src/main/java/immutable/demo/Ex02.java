package immutable.demo;

/**
 Kiểm tra kí tự bắt đầu, kết thúc trong chuỗi s có phải là s1 không.
 Thay thế chuỗi s1 bằng chuỗi s2 trong  chuỗi s
 Loại bỏ các khoảng trắng thừa của chuỗi s3
 Tạo chuỗi con s4 từ chuỗi s bắt đầu từ vị trí số 2
 */
public class Ex02 {
	
	public static void main(String[] args) {
		String[] books = {"SGK123", "SGK234-KM", "STK345", "STK456"};
		for (String book: books) {
			System.out.println(book + " is TextBook: " + (book.startsWith("SGK")));
			System.out.println(book + " is SaleOff: " + (book.endsWith("KM")));
		}
		
		// replace
		String s = "Hello Nam";
		String replaced = s.replace("Hello", "Hi");
		System.out.println("s: " + s);
		System.out.println("replaced: " + replaced);
		
		String redundantSpaces = "    Cheers             from  Viet    Nam  ";
		// regex: replace 1 or n white spaces to 1 whitespace
		// +: 1 || n = {1,}
		String removed = redundantSpaces.trim().replaceAll("\\s+", " ");
		System.out.println(removed);
		
		String parent = "abcdefgh";
		String child = parent.substring(1, 3);
		String generation = "xyz";
		System.out.println("child: " + child);
		
		System.out.println("contains 01: " + parent.contains(child));
		System.out.println("contains 02: " + (parent.indexOf(child) != -1));
		
		System.out.println("contains 03: " + parent.contains(generation));
		System.out.println("contains 04: " + (parent.indexOf(generation) != -1));
	}
}
