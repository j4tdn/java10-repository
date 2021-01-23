package immutable.demo;

public class Ex03 {
	public static void main(String[] args) {
		// contains
		String s1 = "hello how are you";
		String s2 = "you";
		System.out.println(s1.contains(s2));
		
		// split string
		String tokens = "a12-b23-c34";
		String[] elements = tokens.split("-", 2);
		
		System.out.println(elements.length);
		
		iterate(elements);
		
		// delimiter: ", "
		String hobbies = "music, badminton, book, games, code";
		String[] hobbyArray = hobbies.split("[\\s,-.]+");
		iterate(hobbyArray);
	}
	
	private static void iterate(String[] elements) {
		for (String element : elements) {
			System.out.println(element);
		}
	}
}