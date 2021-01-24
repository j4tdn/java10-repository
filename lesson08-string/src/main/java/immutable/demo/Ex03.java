package immutable.demo;

public class Ex03 {
	public static void main(String[] args) {
		// split
		String token = "a12-b23-c34";
		String[] elements = token.split("-", 2);
		iterate(elements);
		System.out.println("===============");

		String hobbies = "music, badminton book -, game, .code";
		String[] hobbyArray = hobbies.split("[\\s,-.]+");
		iterate(hobbyArray);
	}

	private static void iterate(String[] elements) {
		for (String element : elements) {
			System.out.println(element);

		}

	}
}
