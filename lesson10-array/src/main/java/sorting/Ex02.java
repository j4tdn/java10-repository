package sorting;
import static java.util.Comparator.*;
import static java.util.function.Function.*;

import java.util.Arrays;
public class Ex02 {
	public static void main(String[] args) {
		String[] sequences = {"a", "c", null, "B", "A", null};
		// bubbleSort(sequences);
		/*Arrays.sort(sequences, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// auto: ASC  o1 > o2
				//		 DESC o2 > o1
				// null first
				if(o1 == null) {
					return 1; // return 1 --> null last
				}
				if(o2 == null) {
					return -1; // return -1 --> null last
				}
				
				return o2.compareTo(o1);
			}
		});*/
		
		// T(type) R(return)
		// T: String  => String
		// T: Student => Id, Name
		
		Arrays.sort(sequences, nullsFirst(comparing(identity())));
		
		System.out.println(Arrays.toString(sequences));
	}
	
	
}
