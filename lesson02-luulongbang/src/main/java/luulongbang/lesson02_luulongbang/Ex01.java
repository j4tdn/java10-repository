package luulongbang.lesson02_luulongbang;

public class Ex01 {

	public static void main(String[] args) {
		int[] myNum = {5,9,8};
		System.out.println("Array before Sorting");
		System.out.println(myNum[0]);
		System.out.println(myNum[1]);
		System.out.println(myNum[2]);
		int temp = myNum[0];
        for (int i = 0 ; i < myNum.length - 1; i++) {
            for (int j = i + 1; j < myNum.length; j++) {
                if (myNum[i] > myNum[j]) {
                    temp = myNum[j];
                    myNum[j] = myNum[i];
                    myNum[i] = temp;
                }
            }
        }
        System.out.println("Array after Sorting");
        System.out.println(myNum[0]);
        System.out.println(myNum[1]);
        System.out.println(myNum[2]);
}
}
