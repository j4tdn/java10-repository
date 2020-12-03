package ex01;

public enum CirclePosition {
	ONSIDE("Trên đường tròn"), INSIDE("Trong đường tròn"), OUTSIDE("Ngoài đường tròn");

	private String value;
	// enumeration's access modifier default: private
	private CirclePosition(String initial) {
		value = initial;
	}
	
	public String getValue() {
		return value;
	}
}
