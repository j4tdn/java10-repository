package bean;

public enum CirclePos {
	//name   ("value")
	ONSIDE("tren duong tron"),
	INSIDE("trong duong tron"),
	OUTSIDE("ngoai duong tron");
	
	
	private String value;
	//enumeration constructor ' access modifier default : private
	private CirclePos(String inital) {
		// TODO Auto-generated constructor stub
		value = inital;
	}
	
	public String getValue() {
		return value;
	}

}
