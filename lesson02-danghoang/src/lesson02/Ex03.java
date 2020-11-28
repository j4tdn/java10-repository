package lesson02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
    	Scanner ip = new Scanner(System.in);
    	int num = ip.nextInt(), reversedInteger = 0, remainder, originalInteger;
        originalInteger = num;
        
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " là số đối xứng.");
        else
            System.out.println(originalInteger + " không là số đối xứng.");
    }
}
