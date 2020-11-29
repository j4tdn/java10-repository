package ngocthuan.Lesson02_nguyenngocthuan;

import java.util.Scanner;

public class EX05 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter  the number to convert");
	int m = sc.nextInt();
	
	System.out.println("convert to base 2 is= ");
	convert(m);
  }
  public static void convert(int a) {
	  int  douba[] = new int [60];
	  int index = 0;
	  
	 
	while(a>0) {
		  douba[index++] = a%2 ;
		a = a/2;
	  }
	  for (int i = index-1;i >= 0;i--) {
		  System.out.println(douba[i]);
	  }
}
   	
}
