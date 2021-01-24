package bt4;

public class Bai4 {
	public static void main(String[] args) {
		String str = "Welcome   to  JAVA10    class";
		System.out.println("Chuỗi ban đầu: " + str);
		String[] s = str.split("\\s+");
		System.out.print("Chuỗi sau khi xử lý: ");
		for (int i = 0; i < s.length; i++) {
			StringBuffer sb = new StringBuffer(s[i]);
			String reserve = sb.reverse().toString();
			System.out.print(reserve + " ");
		}
	}
}