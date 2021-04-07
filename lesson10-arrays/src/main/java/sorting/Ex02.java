package sorting;

import static java.util.Comparator.*;
import static java.util.function.Function.*;
import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		String[] sequences = {"a", "c", null, "B", null, "A"};
		// bubbleSort(sequences);
		/*Arrays.sort(sequences, new Comparator<String>() {

			public int compare(String o1, String o2) {
				// auto: ASC  o1 > o2
				//       DESC o2 > o1
				// null first
				if (o1 == null) {
					return 1;
				}
				if (o2 == null) {
					// stay at current position if 0
					return -1;
				}
				return o2.compareTo(o1);
			}
		});*/
		
		// T R
		// T: String => String
		// T: Student => Id, Name
		Arrays.sort(sequences, nullsLast(comparing(identity())));
		System.out.println(Arrays.toString(sequences));
	}

}
