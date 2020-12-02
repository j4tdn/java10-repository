package Ex01;

public enum CirclePos {
	ONSIDE("tren duong tron"),
	INSIDE("trong duong tron"),
	OUTSIDE("ngoai duong tron");
	
	private String value;
	
	private CirclePos(String inital) {
		value = inital;
	}
	public String getValue() {
		return value;
	}
	
	
	

}
