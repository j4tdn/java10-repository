package bean;

public class handInteger {
	public int value;
	
	// constructor
	// constructor object's value in heap
	public handInteger (int External) {
		value = External;
	}

	@Override
	public String toString() {
		return "" + value;
	}
	
}
