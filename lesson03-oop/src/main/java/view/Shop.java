package view;

public class Shop {
	public static void main(String[] args) {
		// initial car object
		Car car1 = new Car();
		car1.setColor("Red");
		car1.setId("c01");
		
		Car car2 = new Car();
		car2.setColor("Black");
		car2 = car1;
		car2.setId("c02");
		
		Car car3 = new Car("c03", "Blue", "Mercedes", 1000);
		
		// print object => call toString 
		// every class in Java extends class object 
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
	}
}
