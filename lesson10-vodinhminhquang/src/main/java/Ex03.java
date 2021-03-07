import java.util.Arrays;
import java.util.Comparator;

public class Ex03 {
	public static void main(String[] args) {
		String[] strings = { "-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx" };
		// bubbleSort(eradicateNumbers);
		// System.out.println(Arrays.toString(eradicateNumbers));
		Arrays.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1 == null) {
					return 1; // return 1 --> o1 > o2 --> swap --> null last
				}
				if (o2 == null) {
					return -1; // return -1 --> null last
				}
				return o1.compareTo(o2);
			}
		});

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
