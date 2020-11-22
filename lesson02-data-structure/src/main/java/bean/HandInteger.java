package bean;

public class HandInteger {
	public int value;
//	external: name dung de minh hoa cho du lieu truyen vao
//	constructor
//	construct object's value in heap
	public HandInteger(int external) {
		value = external;
		
	}
	
	@Override
	public String toString() {
		return value + "";
	} 
	
	
	
}
