package anhtuan.lesson02_anhtuan;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] a = new int[5];
		int firstIndex = 20 + rd.nextInt(10);
		int k = 0;
		a[k] = firstIndex;
		while (true) {
			int secondIndex = 20 + rd.nextInt(10);
			int threeIndex = 20 + rd.nextInt(10);
			int forIndex = 20 + rd.nextInt(10);
			int fiveIndex = 20 + rd.nextInt(10);
			if (secondIndex != firstIndex) {
				if (threeIndex != secondIndex && threeIndex != firstIndex) {
					if (forIndex != threeIndex && forIndex != secondIndex && forIndex != firstIndex) {
						if (fiveIndex != forIndex && fiveIndex != threeIndex && fiveIndex != secondIndex
								&& fiveIndex != firstIndex) {
							a[++k] = secondIndex;
							a[++k] = threeIndex;
							a[++k] = forIndex;
							a[++k] = fiveIndex;
							break;
						}
					}
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}
}
