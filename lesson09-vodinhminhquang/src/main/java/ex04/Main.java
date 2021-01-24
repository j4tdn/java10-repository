package ex04;

public class Main {
	public static void main(String[] args) {
		String input = "    Welcome    to        JAVA10   class    ";
		String output = input.trim().replaceAll("\\s+", " ");
		System.out.println(output);
		System.out.println("=======================");
		String[] tokens = output.split("\\s");
		for(String token : tokens) {
			System.out.print(revert(token) + " ");
		}
		
	}
	
	private static String revert(String s) {
		String revertedString = s;
		String result = "";
		for(int i = 0; i < revertedString.length(); i++) {
			result = revertedString.charAt(i) + result;
		}
		return result; 
	}
}
