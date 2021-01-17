package demo;

/**
 * • Kiểm tra kí tự bắt đầu, kết thúc trong chuỗi s
 * • Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s 
 * • Loại bỏ các khoảng trắng thừa của chuỗi s3 
 * • Tạo chuỗi con s4 từ chuỗi s bắt đầu từ vị trí số
 *
 */

public class Ex02 {
	public static void main(String[] args) {
		// SGK 123, SGK234, STK344, STK 456
		String[] books = {"SGK123", "SGK234-KM", "STK344", "STK456"};
		for(String book: books) {
			System.out.println(book + " is Text Book " + book.startsWith("SGK"));
			System.out.println(book + " is Text Book " + book.endsWith("KM"));
		}
		
		// replace
		String s = "Hello Nam";
		String replace = s.replace("Hello", "Hi");
		System.out.println("s: "+s);
		System.out.println("replaced: "+replace);
		
		// Loại bỏ khoảng trắng thừa
		// regex: replace 1 or n white space to 1 white space
							// +:1 || n={1,}
		String rendundantSpace = "Cheers    From Viet  Nam ";
		String removed = rendundantSpace.trim().replaceAll("\\s+"," ");
		System.out.println(removed);
		
		String parent = "abcdfgh";
		String child = parent.substring(1,3);
		String generation = "xyz";
		System.out.println("child: "+child);
		
		
		// Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
		System.out.println("contain  01:" + parent.contains(child));
		System.out.println("contain  02:" +( parent.indexOf(child) != -1));
	}
}
