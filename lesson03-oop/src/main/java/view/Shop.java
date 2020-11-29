package view;

public class Shop {
	public static void main(String[] args) {
		// initial car object
		Car car1 = new Car();
		car1.setColor("Pink");
		car1.setId("C1");
		
		System.out.println("Car1 - color: " + car1.getColor());
		System.out.println("Car1 - id: " + car1.getId());
		System.out.println("Car1 - model: " + car1.getModel());
		
		Car car2 = new Car();
		car2.setColor("Yellow");
		car2 = car1;
		car2.setId("C2");
		
		Car car3 = new Car("C3", "Red", "Honda", 3000);
		// print object -> call toString()
		// every class in JAVA extend class Object
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
	}
}
