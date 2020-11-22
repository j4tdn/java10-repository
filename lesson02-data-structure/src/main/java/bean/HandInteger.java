package bean;

public class HandInteger {
	public int value;
	
	//constructor
	//construct object's value in HEAP
	@Deprecated
	public HandInteger(int external) {
		value = external;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "" + value;
	}
	
	
}
