package lesson02_excercise;

import java.awt.print.Printable;

public class Bai1_NumberIncrease {
	public static void main(String[] args) {
		int a =1 ,b =5 ,c =3; 
		System.out.println("Three numbers: 1 \t 5 \t 3");
		NumberIncrease(a, b, c);
	}
	public static void NumberIncrease(int a, int b, int c) {
		int temp;
		 if(a > b){
		        temp = a;
		        a = b;
		        b = temp;
		    }
		    if(a > c){
		        temp = a;
		        a = c;
		        c = temp;
		    }
		   if(b > c){
		        temp = b;
		        b = c;
		        c = temp;
		    }
			System.out.println("Rank numbers ascending:\t" +a+"\t " +b+"\t " +c ); 
		}
	}

