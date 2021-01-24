package ex03;

// Bài này em copy trên mạng nha anh!! E chưa hiểu lắm
public class Ex03 {
	public static void main(String[] args) {
		String input = "xyz";
		System.out.println("Input: " + input);
		permutation(input, 0, input.length());
	}

	// Function for generating different permutations of the string
	public static void permutation(String s, int start, int end) {
		// Prints the permutations
		if (start == end - 1)
			System.out.println(s);
		else {
			for (int i = start; i < end; i++) {
				// Swapping the string by fixing a character
				s = swapString(s, start, i);
				// Recursively calling function generatePermutation() for rest of the characters
				permutation(s, start + 1, end);
				// Backtracking and swapping the characters again.
				s = swapString(s, start, i);
			}
		}
	}

	// Function for swapping the characters at position I with character at position
	// j
	public static String swapString(String a, int i, int j) {
		char[] b = a.toCharArray();
		char ch;
		ch = b[i];
		b[i] = b[j];
		b[j] = ch;
		return String.valueOf(b);
	}
}
