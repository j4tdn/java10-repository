package bean;

public enum CirclePos {
	ONSIDE("Trên đường tròn"),
	INSIDE("Trong đường tròn"),
	OUTSIDE("Ngoài đường tròn");
	// enumeration constructor's access modifier default: private 
	
	private String value;
	
	
	private CirclePos(String initial) {
		value = initial;
	}
	
	public String getValue() {
		return value;
	}

}
