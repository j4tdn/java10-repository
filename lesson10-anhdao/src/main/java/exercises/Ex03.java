package exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;


public class Ex03 {
	public static void main(String[] args) {
		String[] strings = { "-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx" };
		int[] integer = new int[strings.length];

		// Tăng dần:Special => số âm => số dương => tăng dần các chuỗi còn lại trong
		// mảng.
		System.out.println("ASCENDING --> " + Arrays.toString(sortACS(strings)));
		System.out.println("==================================================");
		System.out.println("DESCENDING --> " + Arrays.toString(sortDESC(strings)));

		//

	}

	public static String[] sortACS(String[] sequences) {
		int[] numbers = new int[sequences.length];
		String[] newstrings = new String[sequences.length];
		String[] s = new String[sequences.length];
		int count1 = 0;
		int count2 = 0;
		int index1 = 0;
		int index2 = 0;
		int k = sequences.length - 1;

		for (int i = 0; i < sequences.length; i++) {
			if (sequences[i] == null) {
				newstrings[k--] = null;
			} else if (sequences[i] == "Special") {
				newstrings[0] = "Special";
			} else if (!sequences[i].matches("[a-zA-Z]+")) {
				numbers[count1++] = Integer.parseInt(sequences[i]);
			} else {
				s[count2++] = sequences[i];
			}
		}
		int[] integer = Arrays.copyOfRange(numbers, 0, count1);
		Arrays.sort(integer);
		String[] string2 = Arrays.copyOfRange(s, 0, count2);
		Arrays.sort(string2);

		for (int i = 1; i <= count1; i++) {
			newstrings[i] = String.valueOf(integer[index1++]);
		}
		for (int i = count1 + 1; i < count1 + count2 + 1; i++) {
			newstrings[i] = string2[index2++];
		}
		return newstrings;
	}

	public static String[] sortDESC(String[] sequences) {
		String[] results = new String[sortACS(sequences).length];
		int index = 0;
		for (int i = results.length - 1; i >= 0; i--) {
			results[index++] = sortACS(sequences)[i];
		}
		return results;
	}
}
