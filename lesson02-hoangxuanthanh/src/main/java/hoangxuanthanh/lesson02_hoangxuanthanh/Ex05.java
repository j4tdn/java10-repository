package hoangxuanthanh.lesson02_hoangxuanthanh;

public class Ex05 {
	public static void main(String[] agrs) {
		int i = 2;
		int j = 1;
		do {
			i=i+1;
			if(laSNT(i)) {
				j=j+1;
			}
		
		} while(j!=200);
		System.out.println(i);
	}


	public static boolean laSNT(int a) {
		for (int i = 2; i <= a/2; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}


}
