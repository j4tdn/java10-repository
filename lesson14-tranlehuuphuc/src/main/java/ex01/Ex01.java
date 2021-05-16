package ex01;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex01 {
  public static void main(String[] args) {
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] arr = new int [n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = input.nextInt();
        }

        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            addElement(map, arr[i]);
        }
        System.out.print("Các phần tử xuất hiện 2 lần: \n");
        for (Integer key : map.keySet()) {
            System.out.printf("%d xuất hiện %d lần.\n", key, map.get(key));
        }
    }

    public static void addElement(Map<Integer, Integer> map, int element) {
        if (map.containsKey(element)) {
            int count = map.get(element) + 1;
            map.put(element, count);
        } else {
            map.put(element, 1);
        }
    }
}