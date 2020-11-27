package vodinhminhquang.lesson02_vodinhminhquang;
/*4: Viết chương trình nhập vào một dãy các số nguyên từ bàn phím. Tìm số lẻ
	lớn nhất thứ hai trong dãy số và in ra.
	Gợi ý : 5 1 9 11 20 19 17 21 30 => Kết quả : 19
 */
public class Exercise04 {
		public static void main(String[] args) {
			int[] arr = {5, 1, 9, 11, 20, 19, 17, 21, 30};
			int result = ascendingOrder(oddArray(arr))[arr.length - 2];

			System.out.println("Gợi ý : 5 1 9 11 20 19 17 21 30");
			System.out.println("=> Kết quả : " + result);

		}
		public static int[] ascendingOrder(int[] arr) {
			int[] oddArray = arr;
			//the most number of times that each number have to be compared
			for(int i = 0; i < oddArray.length - 1; i++) {
				//each number have to go through the fist to the length - i - 1 elements to compare
				//after being done i compare, we don't need to those numbers lying before length - i - 1
				for(int j = 0; j < oddArray.length - i - 1; j++) {
					if(oddArray[j] > oddArray[j + 1]) {
						int temp = oddArray[j];
						oddArray[j] = oddArray[j + 1];
						oddArray[j + 1] = temp;
					}
				}
			}
			return oddArray;
		}
		
		public static int[] oddArray(int[] arr) {
			int[] oddArray = new int [arr.length];
			for(int i = 0; i < oddArray.length; i++) {
				if(arr[i] % 2 == 0) {
					continue;
				}else {
					oddArray[i] = arr[i];
				}
			}
			return oddArray;
		}
}
