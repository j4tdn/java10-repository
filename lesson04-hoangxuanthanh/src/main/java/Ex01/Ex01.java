package Ex01;
 
import java.util.Scanner;
 
public class Ex01 {
	static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		Info sv1 = new Info(1, "thuan", 7.8f, 6.5f);
		System.out.println(sv1);
		Info sv2 = new Info(2, "phuc", 8.7f, 6.5f);
		System.out.println(sv2);
		
		
		Info sv3 = new Info();
		System.out.println("Nhap sv3 : ");
		System.out.println(" id : ");
		sv3.setId(Integer.parseInt(ip.nextLine()));
		System.out.println(" name : ");
		sv3.setName(ip.nextLine());
		System.out.println(" diem LT : ");
		sv3.setLT(ip.nextFloat());
		System.out.println(" diem TH :");
		sv3.setTH(ip.nextFloat());
		System.out.println("============");
	}
}
