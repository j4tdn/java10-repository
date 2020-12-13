package bean;

public enum CirclePos {
	//khong can khai bao kieu du lieu trong class Enum vi trong enum tu dong tao ra object ngay 
	//ben trong class
	
	//khong can khoi tao kieu du lieu, enum tu dong figure out
	
	//name  //value   
	ONSIDE("Trên đường tròn"),
	INSIDE("Trong đường tròn"),
	OUTSIDE("Ngoài đường tròn");
	
	public String value;
	
	//enumeration constructor's access modifier default: private 
	private CirclePos(String value) {
		// TODO Auto-generated constructor stub
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
