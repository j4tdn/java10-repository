package exercise01;

public enum EnumPoint {
	
	ONSIDE("Trên đường tròn"),
	INSIDE("Trong đường tròn"),
	OUTSIDE("Bên ngoài đường tròn");

	public String value;
	
	//enumeration constructor's access modifier default: private 
	//setter
	private EnumPoint(String value) {
		this.value = value;
	}
	//getter
	public String getValue() {
		return value;
	}
}
