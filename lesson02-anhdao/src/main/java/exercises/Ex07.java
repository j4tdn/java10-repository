package exercises;

import java.util.Random;

/*Bài 7: Viết chương trình random 5 số nguyên ngẫu nhiên từ 20 – 30.
Yêu cầu: 5 số ngẫu nhiên không được trùng nhau và trả về mảng 1 chiều
 */
public class Ex07 {
	public static Random rd = new Random();

	public static void main(String[] args) {
		int[] A = new int[5];
		int index = 0;

		do {
			int rand = 20 + rd.nextInt(11);
			if (contains(rand, A)) {
				continue;
			}
			A[index] = rand;
			index++;
		} while (index < 5);
		for (int i = 0; i < 5; i++) {
			System.out.println("" + A[i]);

		}
	}

	// contains
	public static boolean contains(int random, int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (random == a[i]) {
				return true;
			}

		}
		return false;
	}
}