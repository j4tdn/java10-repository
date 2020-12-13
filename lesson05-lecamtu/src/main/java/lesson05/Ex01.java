package lesson05;

import java.util.Map;
import java.util.TreeMap;

public class Ex01 {
		    	     
		    public static void main(String[] args) {
		        int[] a = {3, 15, 21, 0, 15, 17, 21};
		        int temp = a[0];
		        for (int i = 0 ; i < a.length - 1; i++) {
		            for (int j = i + 1; j < a.length; j++) {
		                if (a[i] > a[j]) {
		                    temp = a[j];
		                    a[j] = a[i];
		                    a[i] = temp;
		                }
		            }
		        }
		    }
		    public static void show(int [] a) {
		        for (int i = 0; i < a.length; i++) {
		            System.out.print(a[i] + " ");
		        }
		    
		    Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
	        for (int i = 0; i < a; i++) {
	            addElement(map, a[i]);
	        }
	        System.out.print("Các phần tử xuất hiện 1 lần: ");
	        for (Integer key : map.keySet()) {
	            if (map.get(key) == 1) {
	                System.out.print(key + " ");
	            }
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
