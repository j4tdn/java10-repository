package immutable.demo;

public class Ex03 {
	public static void main(String[] args) {
		// split String
		String tokens = "a12-b23-c34";
		String[] elements = tokens.split("-", 2);
		iterate(elements);

		System.out.println("================================");
		
		// delimiters: \\s (space) and ,
		String hobbies = "music, badminton, book, game, code";
		String[] hobbyArray = hobbies.split("[\\s,-.]+");
		iterate(hobbyArray);
	}
	
	private static void iterate(String[] elements) {
		for(String element: elements) {
			System.out.println(element);
		}
	}
}
