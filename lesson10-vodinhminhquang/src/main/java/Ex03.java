import java.util.Arrays;
import java.util.Comparator;

public class Ex03 {
	public static void main(String[] args) {
		String[] strings = {
				"-2", "-6", "10", null, 
				"4", "8", null, "Special", 
				"a", "c", "b", "xx" };
		// bubbleSort(eradicateNumbers);
		// System.out.println(Arrays.toString(eradicateNumbers));
		Comparator<String> comp = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if (s1 == null) {
					return 1; // return 1 --> o1 > o2 --> swap --> null last
				}
				if (s2 == null) {
					return -1; // return -1 --> null last
				}
				if(s1.equalsIgnoreCase("Special")) {
					return -1;
				}
				if(s2.equalsIgnoreCase("Special")) {
					return 1;
				}
				// number or negative number
				if(s1.matches("-?[0-9]+")) {
					Integer i1 = Integer.parseInt(s1);
					if(s2.matches("-?[0-9]+")) {
						Integer i2 = Integer.parseInt(s2);
						return i1.compareTo(i2);
					}
				}
				return s1.compareTo(s2);
			}
		};
		Arrays.sort(strings, comp);

		System.out.println(Arrays.toString(strings));
		System.out.println();
		Arrays.sort(strings, comp.reversed());
		System.out.println(Arrays.toString(strings));
		System.out.println();

	}

	public static void bubbleSort(String[] sequences) {
		// pivot: out
		// null appears in the last position
		for (int out = sequences.length - 1; out > 0; out--) {
			// vị trí đầu bằng null thì bỏ qua vòng lặp thứ out, tiếp tục vòng lặp out - 1
			if (sequences[out] == null) {
				continue;
			}
			for (int in = 0; in < out; in++) {
				if (sequences[in] == null) {
					String tmp = sequences[in];
					sequences[in] = sequences[out];
					sequences[out] = tmp;
					break;
				}
				
				// o1 > o2 -> cho o1 ra dang sau, o2 len truoc --> ascending
				if (sequences[in].compareTo(sequences[out]) > 0) {
					String tmp = sequences[in];
					sequences[in] = sequences[out];
					sequences[out] = tmp;
				}

			}
		}
	}
}
