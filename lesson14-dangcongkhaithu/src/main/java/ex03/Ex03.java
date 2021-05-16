package ex03;

public class Ex03 {
	public static void main(String[] args) {
		String a = "Word";
		String b = "DrWs";
		boolean bool = anagram(a, b);
		System.out.println(bool);

	}

	private static void sortString(String[] s) {
		for (int out = s.length - 1; out > 0; out--) {
			for (int in = 0; in <= out; in++) {
				if (s[in].compareToIgnoreCase(s[out]) > 0) {
					String tmp = s[in];
					s[in] = s[out];
					s[out] = tmp;
				}
			}

		}
	}

	private static boolean anagram(String a, String b) {
		String[] s1 = a.split("");
		sortString(s1);
		String[] s2 = b.split("");
		sortString(s2);

		if (a.length() != b.length()) {
			return false;
		} else {
			for (int i = 0; i < s1.length; i++) {
				if (!s1[i].equalsIgnoreCase(s2[i])) {
					return false;
				}
			}
		}

		return true;
	}
}
