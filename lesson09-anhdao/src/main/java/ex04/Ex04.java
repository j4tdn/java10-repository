package ex04;


public class Ex04 {

	public static void main(String[] args) {
		String s =  " Welcome  to JAVA10  class ";
		System.out.println(" After revert : " + revert(s));

	}

	public static String revert(String input) {
		String s = input.trim().replaceAll("//s+", " ");
		String[] elements = s.split(" ");
		String results = "";
		for (String element : elements) {
			for (int i = element.length()-1; i >= 0; i--) {
				results += element.charAt(i);
				
			}
			results += " ";
		}
		return results;
	}
}
