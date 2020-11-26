package bean;

public enum CirclePos {
	
     ONSIDE("Trên Đường Tròn"),
     INSIDE("Trong Đường Tròn"),
     OUTSIDE("Ngoài Đường Tròn");
	
	private String value;
     
	//enumeration contructor's access modifier default:
    private CirclePos(String inital) {
		value=inital;
	}
    public String getValue() {
    	return value;
    }
}
