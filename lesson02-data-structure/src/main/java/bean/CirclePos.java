package bean;

public enum CirclePos {
	ONSIDE("Trên đường tròn"),
	INSIDE("Trong đường tròn"),
	OUTSIDE("Ngoài đường tròn");
	
	private String value;
	// enumerate contructor's access modifier default: private
	private CirclePos(String initial) {
		value = initial;
	}
	
	public String getValue() {
		return value;
	}

}
