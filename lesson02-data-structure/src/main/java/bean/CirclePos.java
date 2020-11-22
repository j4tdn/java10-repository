package bean;

public enum CirclePos {

	ONSIDE("Trên đường tròn"),
	INSIDE("Trong đường tròn"),
	OUTSIDE("Ngoài đường tròn");
	private String value;
	// enumeration constructor's access modifier default : prrivate 
	private CirclePos(String initial) {
		value = initial;
		
	}
	public String getValue() {
		return value;
	}

}
