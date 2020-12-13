package Ex01;


public class Ex01 {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 6, 5, 4, 3, 8, 9, 6 };
		System.out.println(getUniqueNumber(arr,arr.length));
		
	}

    public static int getUniqueNumber(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j] && i != j)
                    count++;
            }
            if (count == 0) {
                return arr[i];
            }
        }
        return 0;
    }

}
