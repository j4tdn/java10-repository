package bean;

public enum CircelPos {
	ONSIDE("Trên đường tròn"),
	INSIDE("Trong đường tròn"),
	OUTSIDE("Ngoài đường tròn");
	
	public String value;
	// enumeration constructor's access modified default
	CircelPos(String initial) {
		value = initial;
	}
	
	public String getValue() {
		return value;
	}
}
