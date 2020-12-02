package exercise03;

import java.util.Random;
import java.util.Scanner;

public class testing {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Kich thuoc ma tran: ");
		int n = Integer.parseInt(console.next());
		int[][] randomMatrix = new int [n][n];
		
		Random rd = new Random();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				randomMatrix[i][j] = rd.nextInt(100);
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(randomMatrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
