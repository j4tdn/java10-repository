package bean;

public enum CirclePos {
    ONSIDE("Tren duong tron"),
    INSIDE("Trong duong tron"),
    OUTSIDE("Ngoai duong tron");
	
    public String value;
	//enumeration constructor's access modifier default: private 
	private CirclePos(String initial) {
		// TODO Auto-generated constructor stub
		value = initial;
	} 
	
	public String getValue() {
		return value;
	}
}
