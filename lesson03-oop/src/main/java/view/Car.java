package view;

public class Car {
    //attributes
     private String id;
     private String color;
     private String model;
     private double cost;
     
     // constructor
     // default : emty constructer
     public Car()  {
     // init memory in HEAP
     }
     
      public Car(String id, String color, String model, double cost) {
          this.id = id;
          this.color = color;
          this.model = model;
          this.cost = cost;
      }
      public String getId() {
    	  return id;
      }
      public void setId(String id) {
    	  this.id = id;
      }
      public String getColer() {
          return color;
      }
      public void setColor(String color) {
    	  this.color = color;
      }
      public String getModel() {
          return model;
      }
      public void setModel(String model) {
    	  this.model = model;
      }
      public double getCost(double cost) {
    	  return cost;
      }
      
      public String toString() {
    	  return id + ", " + color + ", " + model + ", " + cost + ", ";
      }
    	  

}
