package ex02;

public class Main {
	public static void main(String[] args) {
		Vahicle car1 = new Vahicle("Dang Cong Khai Thu", "Future Neo", 200, 200000000);
		Vahicle car2 = new Vahicle("Nguyen Thi Anh Thu", "Ford Ranger", 700, 350000000);
		Vahicle car3 = new Vahicle("Le Minh Tinh", "Future Neo", 90, 10000000);

		Vahicle[] cars = { car1, car2, car3 };
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
	}
}
