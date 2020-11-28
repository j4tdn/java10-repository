package quocthang.lesson02_quocthang;

public class ex03 {
	public static void main(String[] args) {
		Symmetrical(12121);
	}
	
	public static void Symmetrical(int num) {
		int reversedInteger = 0, surplus, originalInteger;
        originalInteger = num;
        while( num != 0 )
        {
        	surplus = num % 10;
            reversedInteger = reversedInteger * 10 + surplus; 
            num  /= 10;  
        }
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is the number symmetry");
        else
            System.out.println(originalInteger + " is not the number symmetry");
	}
}
