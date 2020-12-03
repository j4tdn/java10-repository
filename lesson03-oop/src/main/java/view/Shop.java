package view;

public class Shop {
	public static void main(String[] args) {
		// initial car object
		Car car1 = new Car();
		car1.setColor("Green");
		car1.setId("C1");
		
		Car car2 = new Car();
		car2.setColor("Yellow");
		car2 = car1;
		car2.setId("C2");
		
		Car car3 = new Car("C3", "Black", "Toyota", 1000);
		
		// print object => call toString
		// every class in Java extends class Object
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
	}
}
