package hoangxuanthanh.lesson03_hoangxuanthanh;


public class Ex02 {
	public static void main(String[] args) {
		System.out.println("carOwnerName\t rangeOfVehicle\t   capacity\t value  \tcompulsoryTax");
		System.out.println("============================================================================");
		Vehicle xe1 = new Vehicle("xuan thanh \t ", "mec \t              ", 200   , 2000000000,250000000 );
		System.out.println(xe1);
		Vehicle xe2 = new Vehicle("ngoc thuan \t ", "KIA \t              ", 150   , 150000000, 2000000);
		System.out.println(xe2);
		Vehicle xe3 = new Vehicle("huu phuc \t ", "lexus  \t      ",50  , 100000000, 10000000);
		System.out.println(xe3);
	}
}
