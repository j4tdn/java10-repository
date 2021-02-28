package demo;

public class Ex01QuickSort {
	public void swap(int arr[], int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
 
    // ham de chia mang thanh 2 phan, su dung phan tu chot (pivot)
    public int partition(int arr[], int left, int right, int pivot) {
        int leftPointer = left - 1;
        int rightPointer = right;
 
        while (true) {
 
            while (arr[++leftPointer] < pivot) {
                // khong lam gi
            }
 
            while (rightPointer > 0 && arr[--rightPointer] > pivot) {
                // khong lam gi
            }
 
            if (leftPointer >= rightPointer) {
                break;
            } else {
                System.out.println(" Phan tu duoc trao doi: " + arr[leftPointer] 
                        + ", " + arr[rightPointer]);
                swap(arr, leftPointer, rightPointer);
            }
 
        }
 
        System.out.println(" Phan tu chot duoc trao doi: " + arr[leftPointer] 
                + ", " + arr[right]);
        swap(arr, leftPointer, right);
        display(arr);
        return leftPointer;
    }
 
    // ham sap xep
    public void quickSort(int arr[], int left, int right) {
        if (right - left <= 0) {
            return;
        } else {
            int pivot = arr[right];
            int partitionPoint = partition(arr, left, right, pivot);
            quickSort(arr, left, partitionPoint - 1);
            quickSort(arr, partitionPoint + 1, right);
        }
    }
 
    public void display(int arr[]) {
        int i;
        System.out.print("[");
 
        // Duyet qua tat ca phan tu
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
 
        System.out.print("]\n");
    }
 
    public static void main(String[] args) {
        // khoi tao mang arr
        int arr[] = { 6, 7, 0, 2, 8, 1, 3, 9, 4, 5 };
 
        Ex01QuickSort sapXepNhanh = new Ex01QuickSort();
        System.out.println("Mang du lieu dau vao: ");
        sapXepNhanh.display(arr);
        System.out.println("-----------------------------");
        sapXepNhanh.quickSort(arr, 0, arr.length - 1);
        System.out.println("-----------------------------");
        System.out.println("\nMang sau khi da sap xep: ");
        sapXepNhanh.display(arr);
    }
}

