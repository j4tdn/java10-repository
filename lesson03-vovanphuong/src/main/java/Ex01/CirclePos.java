package Ex01;

public enum CirclePos {
	ONSIDE("Trên đường tròn"), 
	INSIDE("Trong đường tròn"), 
	OUTSIDE("Ngoài đường tròn");
	public String value;
// enumeration constructor's access modifier default :private : tập hợp những phần tử:
	private CirclePos(String initial) {
		value = initial;
		
	}
	public String getValue() {
		return value;
	}

}