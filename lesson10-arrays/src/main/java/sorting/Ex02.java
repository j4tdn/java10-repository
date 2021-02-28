package sorting;

import static utils.ArrayUtils.*;

import java.util.Arrays;
import static java.util.Comparator.*;
import static java.util.function.Function.*;

public class Ex02 {
	public static void main(String[] args) {
		String[] sequences = { "a", "c", "B", "A" };
		// bubbleSort(sequences);
	/*	Arrays.sort(sequences, new Comparator<String>() {

			public int compare(String o1, String o2) {
				// auto:ASC o1>o2
				//      DESC o2>o1
				// null first
				if (o1 == null) {
					return 1;
				}
				//o1 != null
				if( o2 == null) {
					return -1;
				}
				return o2.compareTo(o1);
			}
		});*/
		
		Arrays.sort(sequences,nullsFirst(comparing(identity())));
		
		
		
		System.out.println(Arrays.toString(sequences));

	}

}
