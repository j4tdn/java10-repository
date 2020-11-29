package lesson02_excercise;

import java.util.HashSet;
import java.util.Random;

public class bai7 {

	public static void main(String[] args) {
		Random Rand = new Random();
		int e;
		int i;
		int g = 5;
		HashSet<Integer> randomNumbers = new HashSet<Integer>();

		for (i = 0; i < g; i++) {
			e = 20 + Rand.nextInt(11);
			randomNumbers.add(e);
			if (randomNumbers.size() <= 5) {
				if (randomNumbers.size() == 5) {
					g = 5;
				}
				g++;
				randomNumbers.add(e);
			}
		}
		System.out.println("5 so nguyen radom tu 20-30 : " + randomNumbers);
	}
}