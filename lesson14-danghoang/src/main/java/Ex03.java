import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		String s1 = "Word";
		String s2 = "Wodrrr";
		System.out.println("1.Có phải là đảo ngữ không: " + isAnagram(s1, s2));
		char str[] = "dang hoang".toCharArray();
		System.out.println("Ki tu xuat hien nhieu nhat = " + getMax(str));

	}

	public static boolean isAnagram(String w1, String w2) {
		char[] word1 = w1.replaceAll("[\\s]", "").toCharArray();
		char[] word2 = w2.replaceAll("[\\s]", "").toCharArray();
		Arrays.sort(word1);
		Arrays.sort(word2);
		return Arrays.equals(word1, word2);
	}

	public static char getMax(char str[]) {

		int arr[] = new int[26];
		int max = -1;
		char result = 0;

		int len = str.length;

		for (int i = 0; i < len; i++) {
			if (str[i] != ' ') {
				arr[str[i] - 'a']++;
			}
		}
		for (int i = 0; i < 26; i++) {
			if (max < arr[i]) {
				max = arr[i];
				result = (char) (i + 'a');
			}
		}

		return result;
	}
}
