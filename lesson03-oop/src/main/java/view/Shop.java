package view;

public class Shop {
  public static void main(String[] args) {
	//initial car object
	  Car car1 =new Car();
	  car1.setColor("Green");
	  car1.setId("c1");
	  //
	  Car car2 =new Car();
	  car2.setColor("Yello");
	  car2=car1;
	  car2.setId("c2");
	  
	  Car car3 =new Car("c3","Black","Lamborghini",1000);
	  //print object = car1 call toString
	  // every class in Java extends class Object
	  System.out.println(car1);	  
	  System.out.println(car2);	  
	  System.out.println(car3);
}
}
