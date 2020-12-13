package bt;

public class bt1 {
	 int USCLN(int a, int b){
	  a = Math.abs(a);
	  b = Math.abs(b);
	  if(a == 0 || b == 0){
	   return a+b;
	  }
	  while(a != b){
	   if(a >b){
	    a = a- b;
	   }else{
	    b = b -a;
	   }
	  }
	  return a;
	 }
	 int BSCNN(int a,int b){
	    return (a*b)/USCLN(a,b);
	 }
	 public static void main(String args[]){
	    bt1 bscnn = new bt1();
	  System.out.println("Tim boi s chung nho nhat");
	  System.out.print("BSCNN(3,4) = " +bscnn.BSCNN(3, 4));
	 }
	}

	
