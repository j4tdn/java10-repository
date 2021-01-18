package java.lang.Normalizer;

import java.text.Normalizer;

public class Exercise03 {
	public static void main(String[] args) {
		String string = "Em có yêu anh không anh để anh biết còn chờ";
		string = Normalizer.normalize(string, Normalizer.Form.NFD);
		string = string.replaceAll("\\p{M}", "");
		System.out.println(string);
	}
}
