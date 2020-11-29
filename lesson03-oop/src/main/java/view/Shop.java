package view;

public class Shop {
	public static void main(String[] args) {
		// initial car object
		Car car1 = new Car();

		car1.setColor("green");
		car1.setId("c1");

		Car car2 = new Car();

		car2.setColor("red");
		car2 = car1;
		car2.setId("c2");

		Car car3 = new Car("c3", "black", "audi", 1000);

		// print object => call toString
		// every class in Java extends class object
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
	}

}
