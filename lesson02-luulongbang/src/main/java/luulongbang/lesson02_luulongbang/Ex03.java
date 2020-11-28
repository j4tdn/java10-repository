package luulongbang.lesson02_luulongbang;
import java.util.Scanner;
public class Ex03 {
		public static void main(String[] args) {
			{
			    int n;
			    /*n=1221
			     *reverse_n = 1221
			     *n=reverse_n
			     */
			    System.out.println("Enter a number: ");
			    Scanner scanner = new Scanner(System.in);
			    
			    n = scanner.nextInt();
			    
			    int original = n;
			    int reverse = 0;
			    //
			    while(original != 0)
			    {
			    	int rem;
			        rem = original % 10;
			        reverse = reverse*10 + rem;
			        System.out.println(original);
			        original = original/ 10;
			    }
			    System.out.println("Print reverse number: " + reverse);
			    if(reverse == n) {
			    	System.out.print(n);
			    	System.out.println(" is a palindrome");
			    }
			    else {
			    	System.out.println(n);
			        System.out.println(" is not a palindrome");
			    }
			}
		}
}
