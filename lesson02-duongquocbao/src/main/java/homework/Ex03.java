package homework;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
        int n;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter value n: ");
	n = sc.nextInt();
	boolean result = Symmetrical(n);
	if (result) {
		System.out.println(n + " " + "is a symmetrical number");
	} else {
		System.out.println(n + " " + "is a symmetrical number");
	}
}
public static boolean Symmetrical(int n) {
	int result = 0;
	int tpm = n;
	while(tpm%10 != 0) {
                result = result*10 + tpm % 10;
                tpm /= 10;               
	}
            if(result == n) {
                    return true;
            }else {
                    return false;
            }
}
}
