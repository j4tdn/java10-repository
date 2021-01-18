
public class Exercise01 {
	public static void main(String[] args) {
		String text1 = "Minh Quang";
		printCharactersOnALine(text1);
		System.out.println("==============================");		
		printWordOnALine(text1);
		System.out.println("==============================");
		oppositeText(text1);
		
		
	}
	
	private static void printCharactersOnALine (String text) {
		String name = text;
		
		char[] arrName = name.toCharArray();
		
		for(char elements : arrName) {
			if(elements != '\s') {
				System.out.println(elements);
			}
		}
	}
	
	private static void printWordOnALine(String text) {
		String name = text;
		String delimiters = "[\\s]+";
		
		String[] arrName = name.split(delimiters);
		for(String elements : arrName) {
			System.out.println(elements);
			System.out.println();
		}
	}
	private static void oppositeText(String text) {
		String name = text;
		String oppositeName = "";
		
		for(int i = 0; i < name.length(); i++) {
			oppositeName = name.charAt(i) + oppositeName;
		}
		
		System.out.println(oppositeName);
	}
}
