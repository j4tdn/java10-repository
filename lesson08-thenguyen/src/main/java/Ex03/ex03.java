package Ex03;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class ex03 {
	public static void main(String[] args) {
		String input = "Em có yêu anh không anh để anh biết còn chờ \n"
				+ "Em xin lỗi em đã có thái độ không đúng với anh";
		System.out.println(removeAccent(input));
	}
	
	private static String removeAccent(String s) {
		String temp =  Normalizer.normalize(s, Normalizer.Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		return pattern.matcher(temp).replaceAll("");
	}
}
