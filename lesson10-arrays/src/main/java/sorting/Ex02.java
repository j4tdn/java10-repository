package sorting;

import static java.util.Comparator.*;

import java.util.Arrays;
import java.util.function.Function;

public class Ex02 {
	public static void main(String[] args) {
		String[] sequences = { "a", "c", null, "D", "B", "A", null};
		// bubbleSort(sequences);
		/*Arrays.sort(sequences, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// auto: ASC o1 > o2
				// 		 DESC o2 > 01
				// null first
				if(o1 == null) {
					return 1;
				}
				// o1 != null
				if(o2 == null) {
					return -1;
				}
				return o2.compareTo(o1);
			}
		});*/
		
		// T R
		// T: String => String
		// T: Student => Id, name
		
		Arrays.sort(sequences, nullsLast(comparing(Function.identity())));
		       
		
		System.out.println(Arrays.toString(sequences));

	}
}
