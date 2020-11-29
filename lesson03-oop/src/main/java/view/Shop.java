package view;

public class Shop {
	public static void main(String[] args) {
		// initial car object
		Car car1 = new Car();
		car1.setColor("Green");
		car1.setId("C1");
		//print object => call tostring
		// ever class in Java extends class object
		
		
		Car car2 = new Car();
		car2.setColor("Yellow");
		car2 =car1;
		car2.setId("C2");
		
		Car car3 = new Car("C3", "Orange", "lamborghini aventador svj 2020", 1000 );
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
	}
	

}
