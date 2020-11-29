package View;


public class Car {
	// attributes
	private String id;
	private String Color;
	private String Model;
	private double Cost;
	
	// methods
	// default: empty contructor
	public Car() {
	// initial memorry in HEAP
	}
    public Car(String id, String Color, String Model, double Cost) {
    	this.id = id;
    	this.Model = Model;
    	this.Color = Color;
    	this.Cost = Cost;
    }

	// methods
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	 public String getColor() {
		 return Color;
	 }
	 public void setColor(String Color) {
			this.Color = Color;
	 }	
	 
	 public String getModer() {
		 return Model;
	 }
	 public void setModel(String Model) {
			this.Model = Model;
	 }		
	 
	 public double getCost() {
		 return Cost;
	 }
	 public void setCost(double Cost) {
			this.Cost = Cost;
	 }
	 @Override
	 public String toString() {
		 return id +"," + Color + "," + Model + "," + Cost;
	 }
}

   