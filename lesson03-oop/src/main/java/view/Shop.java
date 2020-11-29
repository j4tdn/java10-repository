package view;

public class Shop {
	public static void main(String[] args) {
		// init car object
		Car car1 = new Car();
		car1.setColor("Green");
		car1.setId("c1");
		
		Car car2 = new Car();
		car2.setColor("Yellow");
		car2.setId("c2");
		
		car2 = car1;
		
		Car car3 = new Car("c3", "White", "mec", 1000);
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
	}
}
