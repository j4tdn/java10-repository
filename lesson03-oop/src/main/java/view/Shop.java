package view;

public class Shop {
	public static void main(String[] args) {
		//initial car object
		Car car1 = new Car();
//		car1 = null;
		
		car1.setColor("Green");
		car1.setId("C1");
		
		Car car2 = new Car();
		car2.setColor("Yellow");
		car2 = car1; 
		car2.setId("C2");
		
		Car car3 = new Car("C3","Black","Toyota",1000);
		
		
//		System.out.print("Car1-color: "+ car1.getColor());
//		System.out.println("Car1-id: "+ car1.getId());
//		System.out.println("Car1-model: "+ car1.getModel());
		
		
		
		//print object => call toString
		//everyclass in Java extends class Object
		System.out.println(car1.toString());
		System.out.println(car2.toString());
		System.out.println(car3.toString());


		
		


	}

}