package operator;

public class Ex01 {
  public static void main(String[] args) {
	int a=10;
	a+=1;
	System.out.println(a++);//11
	System.out.println(++a);//13 prefix
	System.out.println(a++);//13 suffix
}
}
