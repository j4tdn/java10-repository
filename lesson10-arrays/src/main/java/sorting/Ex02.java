package sorting;

import static utils.ArrayUtils.*;

import java.util.Arrays;
import static java.util.Comparator.*;
import java.util.Comparator;
import java.util.function.Function;

import utils.ArrayUtils;

public class Ex02 {

	public static void main(String[] args) {
		String[] sequences = { "a", "c", null, "B", "A", null };
		// bubbleSort(sequence);
		// bubbleSortNullLast(sequences);
		/*
		 * Arrays.sort(sequences, new Comparator<String>() { 
		 * // auto: ASC o1 > o2
		 * //       DESC o2 > o1
		 * 
		 * @Override 
		 * public int compare(String o1, String o2) { 
		 * if(o1 == null) {
		 *  return 1; 
		 *  } 
		 *  if(o2 == null) {
		 *  return -1; } 
		 *   return o1.compareTo(o2); }
		 * });
		 */

		Arrays.sort(sequences, nullsFirst(comparing(Function.identity())));
		System.out.println(Arrays.toString(sequences));
	}

}
