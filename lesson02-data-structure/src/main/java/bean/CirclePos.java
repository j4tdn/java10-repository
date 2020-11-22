package bean;

public enum CirclePos {
	Onside("tren duong tron"),
	Outside("ngoai duong tron"),
	Inside("trong duong tron");
	private String value;
	//enumeration constructor's access modifier default
	 private CirclePos(String initial) {
		 value =initial;

}
	 public String getValue() {
		 return value;
	 }
}
