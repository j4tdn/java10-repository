package bean;

public enum CiclePos {
	ONSIDE ("Trên đường tròn"),
	INSIDE ("Trong đường tròn"),
	OUTSIDE ("Ngoài đường tròn");

	private String value;
	private CiclePos(String initial) {
		value =initial;
	}
	public String getValue() {
		return value;
	}
}
