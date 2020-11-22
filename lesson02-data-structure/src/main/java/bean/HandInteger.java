package bean;

public class HandInteger {
	public int value;
	// constructor
	// construct object's value in heap
	public HandInteger(int external) {
		value = external;

	}
	
	public String toString() {

		return "" + value;
	}
}
