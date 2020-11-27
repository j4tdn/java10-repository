package io;

public class Ex04 {
	public static void main(String[] args) {
		int[] myNum = {5,9,8};
		System.out.println(myNum[0]);
		System.out.println(myNum[1]);
		System.out.println(myNum[2]);
		int temp = myNum[0];
        for (int i = 0 ; i < myNum.length - 1; i++) {
            for (int j = i + 1; j < myNum.length; j++) {
                if (myNum[i] > myNum[j]) {
                    temp = myNum[j];
                    myNum[j] = myNum[i];
                    myNum[i] = temp;
                }
            }
        }
        System.out.println(myNum[0]);
        System.out.println(myNum[1]);
        System.out.println(myNum[2]);
		/* 
		int[] sortedNum;
		sortedNum = new int[3];
		System.out.println(sortedNum[0]);
		System.out.println(sortedNum[1]);
		System.out.println(sortedNum[2]);
		if (myNum[0] < myNum[1] && myNum[0] < myNum[2]) {
			sortedNum[0] = myNum[0];
		}
		else if (myNum[2] < myNum[1]) {
			sortedNum[1] = myNum[2];
		}
		*/
	}
	
}
