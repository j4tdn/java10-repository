package view;

public class Shop {
	public static void main(String[] args) {
		//initial car object
		Car car1 = new Car();
		car1.setcolor("Green");
		car1.setid("C1");
		
		Car car2 = new Car();
		car2.setcolor("Yellow");
		car2=car1;
		car2.setid("C2");
		
		Car car3=new Car("C3", "black", "BMW", 1000);
		//print object => call toString
		//every class in Java extends class object
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
	}
}
