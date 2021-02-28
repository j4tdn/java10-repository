package utils;

import java.util.Arrays;

import sorting.SortOrder;

public class ArrayUtils {
	public static void main(String[] args) {
		
	}
		

	 // for-index
    private static void forIndex(int[] items) {
    	for(int i = 0; i < items.length; i++) {
    		System.out.println("items[" + i + "] = " + items[i] + "   ");
    	}
    }
    //for-each
    public static void forEach(int[] items) {
    	System.out.println();
    	for(int item : items) {
    		System.out.println(item + "   ");
    	}
    }
    
    public static void forIndex2D(int[][] items) {
    	for(int row = 0; row < items.length; row++) {
    		for(int col = 0; col < items[0].length; col++) {
    			System.out.print(items[row][col] + "");
    		}
    		System.out.println();
    	}
    }
    public static void bubbleSort(String[] sequences) {
		//privot: out
		for (int out = sequences.length-1; out >0; out--) {
			
			if(sequences[out] == null) {
				continue;
			}
			for (int in = 0; in < out ; in++) {
				if (sequences[in] == null) {
					String tmp = sequences[in];
					sequences[in] = sequences[out];
					sequences[out] = tmp;
					break;
				}
				if (sequences[in].compareTo(sequences[out]) >0)  {
					String tmp = sequences[in];
					sequences[in] = sequences[out];
					sequences[out] = tmp;
				}
			}
		}
	}
    
    public static void sort(int[]numbers, SortOrder order) {
    	Arrays.sort(numbers);
    	if (order == SortOrder.DESC) {
    		reverse(numbers);
    	}
    }
    private static void reverse(int[] numbers) {
    	for(int i = 0; i < numbers.length ; i++) {
    		int tmp = numbers[i];
    		numbers[i] = numbers[numbers.length-i-1];
    		numbers[numbers.length - i -1] = tmp ;
    	}
    }
}  
