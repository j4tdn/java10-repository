package sorting;

import static utils.ArrayUtils.*;
import static java.util.Comparator.*;
import static java.util.function.Function.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Ex02 {
	public static void main(String[] args) {
		String[] sequences = { "a", "c",null, "B", "A", null };
		// bubbleSort(sequences);
		/*Arrays.sort(sequences, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// auto ASC  o1>o2
				// auto DESC o2>o1
				// null first
				if(o1 == null) {
					return -1;
				}
				// o1 != null
				if(o2 == null) {
					return 1;
				}
				return o1.compareTo(o2);
			}
		});*/
		// T R
		// T: String => String
		// T: Student => Id, Name
		
		Arrays.sort(sequences, nullsLast(comparing(identity())));
		System.out.println(Arrays.toString(sequences));
	}
}
