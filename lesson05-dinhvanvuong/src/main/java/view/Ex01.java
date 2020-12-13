package view;

import java.util.Map;
import java.util.TreeMap;

public class Ex01 {
	public static void main(String[] args) {
		int[] x = { 3, 15, 21, 0, 15, 17, 21 };
		getUniqueNumbers(x);
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < x.length; i++) {
            addElement(map, x[i]);
        }
        System.out.print("Element appears only once: ");
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
		
	

	public static int[] getUniqueNumbers(int x[]) {
		int tpm;
		for (int i = 0; i < x.length - 1; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] > x[j]) {
					tpm = x[i];
					x[j] = x[i];
					x[j] = tpm;

				}
				System.out.println("Output: " +x[i]);
			}
		}

		return x;

	}

}
