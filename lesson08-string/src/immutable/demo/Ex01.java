package immutable.demo;

/*
 * Tính chiều dài của chuỗi s
 * Nối chuỗi s1 vào chuỗi s
 * Lấy một ký tự tại vị trí index trong chuỗi s
 * Duyệt từng phần tử trong chuỗi
 * Tìm vị trí xuất hiện đầu tiên, cuối cùng của chuỗi s2 trong chuỗi s
 */
public class Ex01 {
	public static void main(String[] args) {
		String s = "welcome";
		System.out.println("lenght: " + s.length());
		
		// nối chuỗi
		String s1 = s + " to Java 10";
		System.out.println("s1: " + s1);
		
		String s2 = s.concat("to Java 01");
		System.out.println("s2: " + s2);
		
		// lấy một ký tự tại index 3
		System.out.println("index 3: " + s.charAt(3));
		
		System.out.println("==== Iterating ====");
		for(int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + " ");
		}
		System.out.println();
		
		// vị trí xuất hiện đầu tiên của "e" trong s
		// welcome
		System.out.println("s: " + s);
		System.out.println("start e: " + s.indexOf("e")); // 1
		System.out.println("start l: " + s.indexOf("l")); // 2
		System.out.println("last e : " + s.lastIndexOf("e")); // 6
		System.out.println("start j : " + s.indexOf("j")); // -1
		
		System.out.println("s1: " + s1);
		System.out.println("contains: " + s1.indexOf("to"));
	}
}
 