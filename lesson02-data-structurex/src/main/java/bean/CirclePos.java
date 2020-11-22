package bean;

public enum CirclePos {

  ONSIDE("Tren duong tron"),
  INSIDE("Trong duong tron"),
  OUTSIDE( "Ngoai duong tron");
	//name of enum 
	public String value;
	//enum Contructor access modifier default: private 
	 CirclePos(String initial) {
		value=initial;
	}
	 public String getValue() {
		 return value;
	 }
}
