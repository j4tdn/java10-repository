package luulongbang.lesson02_luulongbang;
import java.util.Scanner;
public class Ex06 {
	public static void main(String[] args) {
		//n=100000; 1 to n
		int n;
		Scanner scan= new Scanner(System.in);
        System.out.println("Enter value for n:");
        n=scan.nextInt(); //100000
	
		for (int nr = 0; nr <= n; nr++) {
			System.out.println(nr);
			//check if nr is prime number?
			if (isPrimeNumber(nr)==true) {
				System.out.println(" is prime number");
			}
			else {
				System.out.println("is not prime number");
			}
				
			 
		}
	}
	/*
	nr = 5: 1 va chinh no, mot so nam giua 1 va can_hai(5)
			for i (2, can_hai(5))
			if nr/i
	nr = 16
	sR = sqrt(16) = 4
	i=2 -> sR
		nr%2
		nr%3
		nr%4 
	
	*/  
			
	public static boolean isPrimeNumber(int nr) { 
		int squareRoot = (int) Math.sqrt(nr); //nr= 5 -> Math.sqrt(5) = 2...
		for (int i=2; i< squareRoot; i++) {
			if(nr % i == 0) {
				return false;
			}
		}
		return true;
	}
}
