package luulongbang.lesson02_luulongbang;
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
        int n;
        System.out.println("Enter a integer number");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println("Binary of the number");
        System.out.print(Integer.toBinaryString(n));
        //10 = 0*2^0 + 1*2^1 + 2*2^2 + 1*2^3 = 0 + 2 + 0 + 8
        
        /*System.out.println("So " + n + " trong he co so 2 = "
                + Ex05.convertNumber(n, 2));
                */
    }
     
   /*
    public static String convertNumber(int n, int b) {
    	if (n < 0 || b < 2 || b > 16 ) {
            return "";
        }
         
        StringBuilder sb = new StringBuilder();
        int m;
        int remainder = n;
         
        while (remainder > 0) {
            if (b > 10) {
                m = remainder % b;
                if (m >= 10) {
                    sb.append((char) (CHAR_55 + m));
                } else {
                    sb.append(m);
                }
            } else {
                sb.append(remainder % b);
            }
            remainder = remainder / b;
        }
        return sb.reverse().toString();
    }
    */
}
