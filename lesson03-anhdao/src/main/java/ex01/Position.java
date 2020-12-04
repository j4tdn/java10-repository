package ex01;

public enum Position {
	ONSIDE("Trong đường tròn"), INSIDE("Trên đường tròn"), OUTSIDE("Ngoài đường tròn");

	private String value;

	private Position(String innital) {
		value = innital;
	}

	private String getValue() {
		return value;

	}
}
