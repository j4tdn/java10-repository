package sorting;

import static utils.ArrayUtils.*;
import static java.util.Comparator.*;

import static java.util.function.Function.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Ex02 {
	public static void main(String[] args) {
		String[] sequences = {"a","b",null,"c","Bc",null,"A"};
		
		// bubbleSort(sequences);
	/*	Arrays.sort(sequences, new Comparator<String>() {

			public int compare(String o1, String o2) {
				
				//ASC o1 > o2
				//DESC o2 > o1
				if (o1 == null) {
					return 1;
				}
				if (o2 == null) {
					return -1;
				}
				return o2.compareTo(o1);
			}
		}); */
		
	
		
//		Arrays.sort(sequences,Comparator.comparing(Function.identity()));
		Arrays.sort(sequences,nullsFirst(comparing(identity())));
//		Arrays.sort(sequences,nullsLast(comparing(identity())));

		
		 System.out.println(Arrays.toString(sequences));
		
	}

}
