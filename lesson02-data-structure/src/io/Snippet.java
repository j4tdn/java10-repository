package io;

public class Snippet {
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
	        System.out.print(myNum[0]);
	        System.out.print(myNum[1]);
	        System.out.print(myNum[2]);
}

