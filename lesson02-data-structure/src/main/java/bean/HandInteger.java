package bean;

public class HandInteger {
	public int value;
	
	// constructor
	// constructor object's value in heap
	public HandInteger(int external) {
		value = external;
	}

	@Override
	public String toString() {
		return "" + value;
	}
	
}
