package lesson02_excercise;

public class Bai3_NumberSymmetrical {
	public static void main(String[] args) {
		Symmetrical(1234321);
	}
	
	public static void Symmetrical(int num) {
		int reversedInteger = 0, surplus, numberOriginal;
        numberOriginal = num;
        while( num != 0 )
        {
        	surplus = num % 10;
            reversedInteger = reversedInteger * 10 + surplus; 
            num  /= 10;  
        }
        if (numberOriginal == reversedInteger)
            System.out.println(numberOriginal + " is the number symmetrical");
        else
            System.out.println(numberOriginal + " is not the number symmetrical");
	}
}
