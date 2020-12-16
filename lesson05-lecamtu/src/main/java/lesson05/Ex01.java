package lesson05;

public class Ex01 {
		    	     
		    public static void main(String[] args) {
		        int a[] = {3, 15, 21, 0, 15, 17, 21};
		        int temp = a[0];
		        for (int i = 0 ; i < a.length - 1; i++) {
		            for (int j = i + 1; j < a.length; j++) {
		                if (a[i] > a[j]) {
		                    temp = a[j];
		                    a[j] = a[i];
		                    a[i] = temp;
		                }
		            }
		        }
		        for (int i = 0; i < a.length; i++) {
					if (i == 0) {
						if (a[i] != a[i + 1]) {
							System.out.println("Phần tử xuất hiện một lần duy nhất: " + a[i]);
						}
					}

					else if (i == a.length - 1) {
						if (a[i] != a[i - 1]) {
							System.out.println("Phần tử xuất hiện một lần duy nhất: " + a[i]);
						}
					}

					else {
						if (a[i] != a[i + 1] && a[i] != a[i - 1]) {
							System.out.println("Phần tử xuất hiện một lần duy nhất: " + a[i]);
						}
					}
		        }
		    }
}
