package lesson02_excercise;

import java.util.Random;

public class Bai7_RandomNumber {
	public static void main(String[] args) {
		Random random = new Random();
		int [] a = new int [5];
		int firstIndex = 20 + random.nextInt(10);
		int k = 0;
		a[k] = firstIndex;
		while(true) {
			int secondIndex = 20 + random.nextInt(10);
			int threeIndex = 20 + random.nextInt(10);
			int fourIndex = 20 + random.nextInt(10);
			int fiveIndex = 20 + random.nextInt(10);
			if(secondIndex != firstIndex) {
				if(threeIndex != secondIndex && threeIndex != firstIndex) {
					if(fourIndex != threeIndex && fourIndex != secondIndex && fourIndex != firstIndex) {
						if(fiveIndex != fourIndex && fiveIndex != threeIndex && fiveIndex != secondIndex && fiveIndex != firstIndex) {
							a[++k] = secondIndex;
							a[++k] = threeIndex;
							a[++k] = fourIndex;
							a[++k] = fiveIndex;
							break;
						}
					}
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
	}

}

