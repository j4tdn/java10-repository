package bean;

import javax.crypto.spec.DHPublicKeySpec;

public class HandInteger {
	public int value;
	
	public HandInteger(int external) {
		value = external;
	}
	
	@Override
	public String toString() {
		return ""+ value;
	}
}
