package demoSortingEx03;

import java.util.Arrays;
import java.util.Comparator;

import static utils.ArrayUtils.*;

public class Ex03 {
	public static void main(String[] args) {
		String[] sequences1 = { "1", "0", "x", "a", "b", "10", "2" };
		String[] sequences2 = { "1", "0", null, "x", "a", "b", null, "10", "2" };
        //
		//lambda(o1, o2) -> o1.compareTo(o2);
		Arrays.sort(sequences2, new Comparator<String>() {

			@Override
			//0==> giữ nguyên , -1 ==> k hóa vị  , 1==> hóa vị ,o1 và 02 là 2 phần tử kề nhau
			public int compare(String o1, String o2) {
				if(o1==null) {
					return -1;
				}
				if(o2==null) {
					return 1;
				}
				return o1.compareTo(o2); // ascending
				//o2.compareTo(o1) ==> descending
			}
		});

		// sort bubble
		//Arrays.sort(sequences1);
		forEachString(sequences2);
	}
}
