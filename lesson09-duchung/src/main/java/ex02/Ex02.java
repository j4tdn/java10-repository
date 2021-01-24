package ex02;

public class Ex02 {
	public static void main(String[] args) {
        String test = "01a2b3456cde478";
        print(test);
    }

public static void print(String x){
    char[] chart = x.toCharArray(); 
    for(int i = 0; i < x.length(); i++){
       if(Character.isDigit(chart[i])){
    	   System.out.print(chart[i]);
    	   i+=1;
        }
       else {
		System.out.print(" ");
	}
    }
}
}
