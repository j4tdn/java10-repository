package bean;

public enum CirclePos {
	// name
	ONSIDE("Trên đường tròn"),
	INSIDE("Trong đường tròn"),
	OUTSIDE("Ngoài đường tròn");
	
	private String value;
	
	// enumeration constructor's access modifier default: private
	CirclePos(String initial) {
		value = initial;
	}
	
	public String getValue() {
		return value;
	}
	
}
