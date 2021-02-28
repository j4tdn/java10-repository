package sorting;

import static java.util.Comparator.*;

import java.util.Arrays;
import java.util.function.Function;

public class Ex02 {
	public static void main(String[] args) {
		String[] sequences = { "a", "c", null, "B", "A", "D", null };
		// bubbleSort(sequences);
		/*
		 * Arrays.sort(sequences, new Comparator<String>() {
		 * 
		 * public int compare(String o1, String o2) { if (o1 == null) { return 1; } if
		 * (o2 == null) { return -1; } return o2.compareTo(o1);// giảm dần //
		 * o1.compareTo(o2); tăng dần } });
		 */

		Arrays.sort(sequences, nullsFirst(comparing(Function.identity())));

		System.out.println(Arrays.toString(sequences));
	}
}
