package view;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// đều là file java : shop lấy dữ liệu show ra màn hình
		// initial car object

		Car car1 = new Car();
		car1.setColor("Green");
		car1.setId("C1");
		
		Car car2 = new Car();
		car2.setColor("Yellow");
		car2 = car1;
		car2.setId("C2");
		
		Car car3 = new Car("C3", "Black", "Toyota", 1000);

//		System.out.println("Car 1 - Color: " + car1.getColor());
//		System.out.println("Car 1 - Id: " + car1.getId());
//		System.out.println("Car 1 - Model: " + car1.getModel());
		//print object => call toString
		//everyclass in Java extends class object
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
	}

}
