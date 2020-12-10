package bean;

public class HandInteger {
	public int value;

	// Contructor
	// contructor object's value in heap
	public HandInteger(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "" + this.value;
	}

}
