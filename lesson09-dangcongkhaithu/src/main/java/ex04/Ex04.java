package ex04;

public class Ex04 {
	public static void main(String[] args) {
		String s = "   Welcome   to JAVA10   class  ";
		
		String[] splits = splitString(s.trim());
		String result = "";
		
		for(String ss: splits) {
			result += reveseString(ss) + " ";
		}
		
		System.out.println(result.trim());
		
		
	}
	
	private static String[] splitString(String s) {
		String[] results = s.split("\s+");
		
		return results;
	}
	
	private static String reveseString(String s) {
		StringBuilder sb = new StringBuilder();
		sb = sb.append(s).reverse();
		
		return sb.toString();
	}
}
