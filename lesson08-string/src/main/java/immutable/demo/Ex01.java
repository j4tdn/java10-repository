package immutable.demo;

public class Ex01 {
	public static void main(String[] args) {
		String s = "Welcome";
		System.out.println(s.length());	// chiều dài chuỗi
		
		// nối chuỗi
		String s1 = s.concat(" to Java10");
		System.out.println(s1);
		
		// lấy 1 kí tự ở vị trí bất kì
		System.out.println(s.charAt(3));
		
		// duyệt từng kí tự
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i) + " ");
		}
		
		// vị trí
		System.out.println(s.indexOf('e'));
		System.out.println(s.lastIndexOf('e'));
	}
}
