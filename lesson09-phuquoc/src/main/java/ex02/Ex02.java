package ex02;

public class Ex02 {
	public static void main(String[] args) {
		String s1 = "01a2b3456cde478";
		String result = " ";
		String reuslt1 = " ";
		System.out.println("s1:"+s1);
		s1 = s1.replaceAll("[^0-9,-\\.]", " ");
		System.out.println(s1);

		for (int i = 1; i <= s1.length() - 1; i++) {
			if (s1.charAt(i) != ' ') {
				result += s1.charAt(i);
			}
			reuslt1 += s1.charAt(i+1);
		
			
			
		}
	}
}