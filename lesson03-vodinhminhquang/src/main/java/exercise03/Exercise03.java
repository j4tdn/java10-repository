package exercise03;

import java.util.Random;
import java.util.Scanner;

public class Exercise03 {
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
		System.out.println("================================");
		int saddleElement = saddleElement(randomMatrix, n);
		
		if(saddleElement == -1) {
			System.out.println("The MxN matrix has none of the saddle element");
		}else {
			System.out.println(saddleElement + " is the saddle element of the MxN matrix");			
		}
	}
	
	public static int[] elementsOfSmallestNumberRow(int[][] arr, int collumnPosition, int n) {
		int[] collumArray = new int [n];
				
		for(int i = 0; i < n; i++) {
			collumArray[i] = arr[i][collumnPosition];
		}
		return collumArray;
	}
	
	public static boolean isSaddleElement(int[] arr, int rowPosition) {
		for(int i = 0; i < arr.length; i++) {
			if (arr[rowPosition] < arr[i]) {
				return false;
			}
		}
		return true;
	}
	public static int saddleElement(int[][] arr, int n) {
		int min;
		for(int i = 0; i < 3; i++) {
			min = arr[i][0];
			for(int j = 0; j < 3; j++) {
				if(arr[i][j] < min) {
					min = arr[i][j];
					if(isSaddleElement(elementsOfSmallestNumberRow(arr, j, n), i)){
						return min;
					}
				}
			}
		}
		return -1;
	}
}
