package Ex03;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class Ex03 {
	public static void main(String[] args) {	  
		  System.out.print(StringUtils.removeAccent("Em có yêu anh không anh để anh biết còn chờ\r\n" + 
		  		"Em xin lỗi em đã có thái độ không đúng với anh"));
		 }
	 public static class StringUtils {
	 public static String removeAccent(String s) {
	  String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
	  Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
	  return pattern.matcher(temp).replaceAll("");
	 }
	} 
}
