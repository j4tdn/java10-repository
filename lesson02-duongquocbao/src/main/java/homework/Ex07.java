package homework;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		int [] a = new int[5];
        Random r = new Random();
        a[0] = r.nextInt(30-20) + 20;
        System.out.println("Random 5 :\n" + a[0] + " ");
        for(int i = 1; i < a.length; i++){
            int result = r.nextInt(30-20) + 20;
            a[i] = result;
            System.out.println(a[i] + " ");
        }
    }
}
