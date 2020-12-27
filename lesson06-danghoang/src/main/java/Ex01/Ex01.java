package Ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {
    public static void main (String[] args){
        Math cal = new Math();
        cal.input();
        System.out.println("//----------------------------------------//");
        cal.show();
    }
}
 
class Math{
    public int a, b;
    public void input(){
        Scanner input = new Scanner(System.in);
        try {  // set input method in try{}.
        System.out.print("Let put value of a: ");
        a = input.nextInt();
        System.out.print("Let put value of b: ");
        b = input.nextInt();
        }
        catch(InputMismatchException e){    //set Exception and error report in catch(){}.
            System.out.println("Error: " + e.toString());
        }
        catch(Exception e){
            System.out.println("Error: " + e.toString());
        }   
    }
       
    public void show(){
        System.out.println("ax + b = 0, a = " + a + ", b = " + b);
        try{    // set input method in try{}.
          System.out.println("=> x = " + (-b/a));
        }
        catch(ArithmeticException e){  //set Exception and error report in catch(){}.
            System.out.println("Error: " + e.toString());
        }
    }
}