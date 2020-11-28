package homework;

import java.text.DecimalFormat;

public class Ex02 {
	public static void main(String[] args) {
        DecimalFormat dcf = new DecimalFormat("###,###");
	int []a = {4, 7, 12, 18};	
        double sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += Factorial(a[i]);
        }
        System.out.println("Sum of "+ a[0] + "! + " +a[1] + "!  " 
        + a[2] + "! + " +a[3] + "! \nis:  "+ dcf.format(sum)  );	
	}
    public static double Factorial(int n) {
	double s = 1;
	for (int i = 1; i <= n; i++) {
            s *= i;
        }
        return s;
    }
}
