package demo;

/**
 * • Tính chiều dài của chuỗi s 
 * • Nối chuỗi s1 vào chuỗi s 
 * • Lấy một ký tự tại
 * vị trí index trong chuỗi s
 *  • Duyệt từng phần tử trong chuỗi 
 *  • Tìm vị trí xuất
 * hiện đầu tiên, cuối cùng của chuỗi s2 trong chuỗi s
 *
 */

public class Ex01 {
	public static void main(String[] args) {
		String s = "welcome";
		System.out.println("legth: "+s.length());
		
		// Nối chuỗi
		String s1 = s + " to JAVA 10";
		System.out.println("s1: " +s1);
		
		// Lấy kí tự tại index
		System.out.println("index:" +s.charAt(3));
		
		// Duyệt từng phần tử trong chuỗi
		System.out.println("=== Iterating===");
		for(int i=0; i< s.length(); i++) {
			System.out.println(s.charAt(i)+ " ");
		}
		System.out.println();
		
		// Vị trí đầu tiên của e trong s
		// Welcome
		System.out.println("start e:"+ s.indexOf("e")); //1
		System.out.println("start l:"+ s.indexOf("l")); //2
		System.out.println("last e:"+ s.indexOf("e")); //6
		System.out.println("start j:"+ s.indexOf("j")); //-1 không có trong chuỗi
		System.out.println("s1 : " +s1);
		System.out.println("contain: "+s1.indexOf("to"));
	}
}
