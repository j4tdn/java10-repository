package vodinhminhquang.lesson02_vodinhminhquang;

import java.util.ArrayList;

/*Nhập vào một số bất kỳ. Kiểm tra số đó có phải là số đối xứng hay không
 * VD: 121 13331 là số đối xứng.
 */
public class Exercise03 {
	public static void main(String[] args) {
		boolean number1 = palindromeNumber(listNumber(121));
		boolean number2 = palindromeNumber(listNumber(13331));
		if(number1) {
			System.out.println("121 là số đối xứng");
		}
		if(number2) {
			System.out.println("13331 là số đối xứng");
		}
	}
	
	public static boolean palindromeNumber(ArrayList<Integer> listNumber) {
		int count = 0;
		int flag = listNumber.size() / 2;
		for (int i = 0; i < listNumber.size() / 2; i++) {
			for (int j = listNumber.size() - 1; j > listNumber.size() / 2; j--) {
				if (listNumber.get(i) == listNumber.get(j)) {
					count++;
					if(count == flag) {
						return true;
					}
				}
			}
		}
		return false;
	}
	public static ArrayList<Integer> listNumber(int number){
		ArrayList<Integer> listNumber = new ArrayList<>();
		
		int remainder;
		while(number != 0) {
			remainder = number % 10;
			number /= 10;
			for(int i = listNumber.size(); i >= 0; i--) {
				listNumber.add(remainder);
			}
		}
		return listNumber;
	}
}
