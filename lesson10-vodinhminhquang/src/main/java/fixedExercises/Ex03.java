package fixedExercises;

public class Ex03 {
	public static void main(String[] args) {
		String[] strings = {
				"-2", "-6", "10", null, 
				"4", "8", null, "Special", 
				"a", "c", "b", "xx" };
		
		print(strings);
		
	}
	private static void sort(String[] strings) {
		
	}
	private static void print(String[] strings) {
		System.out.println();
		for(String string : strings) {
			System.out.print(string + " ");
		}
	}
}
