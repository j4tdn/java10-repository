package ex02;

public class Ex02 {
	public static void main(String[] args) {

		// chuoi ban dau
		String str = "01a2b3456cde478";

//		  thay the toan bo nhung ky tu khong phai so, khong phai dau am, khong phai dau
//		  cham bang khoang trong

		str = str.replaceAll("[^0-9,-\\.]", " ");

//		 cat thanh cac phan tu thong qua khoang trong
		String[] item = str.split(" ");

		// duyet cac phan tu, neu la so thi in ra
		for (int i = 0; i < item.length; i++) {
			try {
				Double.parseDouble(item[i]);
				System.out.println(item[i]);
			} catch (NumberFormatException e) {
			}
		}
	}
}

