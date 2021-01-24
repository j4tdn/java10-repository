package immutable.demo;
/*
 * Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
 * Kiểm tra chuỗi s có bắt đầu hoặc kết thúc bằng một suffix nào đó hay ko.
 * Cắt chuỗi s thành các chuỗi con nhỏ hơn theo vị trí bất kì
 * Convert char array to string and vice verse
 */
public class Ex03 {
	public static void main(String[] args) {
		// split String
		String tokens = "a12-b23-c34";
		String[] elements = tokens.split("-", 2);
		System.out.println("length: " + elements.length);
		iterate(elements);
		System.out.println("===========");
		
		// delimiters ,\\s string parsing
		String hobbies = "music  badminton -book -,game .---code";
		String[] hobbyArray = hobbies.split("[,\\s-.]+");
		iterate(hobbyArray);
	}
	
	private static void iterate(String[] elements) {
		for(String element : elements) {
			System.out.println(element);
		}
	}
}
