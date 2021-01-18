package ex;

import java.text.Normalizer;

public class Ex03 {
	public static void main(String[] args) {
		String chuoi = "Em có yêu anh không anh để anh biết còn chờ\r\n"
				+ "Em xin lỗi em đã có thái độ không đúng với anh";
		System.out.println(flattenToAscii(chuoi));
	}

	public static String flattenToAscii(String string) {
		StringBuilder sb = new StringBuilder(string.length());
		string = Normalizer.normalize(string, Normalizer.Form.NFD);
		for (char c : string.toCharArray()) {
			if (c <= '\u007f')
				string.trim().replaceAll("đ", "đ");
				sb.append(c);
		}
		return sb.toString();
	}
}
