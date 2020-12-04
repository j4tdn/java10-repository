package ex03;

public class CheckNumber {

	public static boolean minRow(int Arr[][], int indexrow, int indexcol, int row, int column) {
		int min = Arr[indexrow][indexcol];
		for (int j = 0; j < column; j++) {
			if (Arr[indexrow][j] <= min) {
				return false;
			}
		}
		return true;
	}

	public static boolean maxColumn(int Arr[][], int indexrow, int indexcol, int row, int column) {
		int max = Arr[indexrow][indexcol];
		for (int i = 0; i < row; i++) {
			if (Arr[i][indexcol] >= max) {
				return false;
			}
		}
		return true;
	}

	public static void saddleElement(int Arr[][], int row, int column) {
		int count = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if (minRow(Arr, i, j, row, column) && maxColumn(Arr, i, j, row, column)) {
					System.out.println(" Saddle Element : A [" + i + "] [" + j + "] = " + Arr[i][j]);
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println("No exist saddle element! ");
		}
	}
}
