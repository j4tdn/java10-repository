package tranlehuuphuc.lesson03_tranlehuuphuc;

public class vehicle {
	private String name;
	private String carName;
	private int capacity;
	private long value;
	private long compulsoryTax;
	public vehicle( ) {
		
	}
	
	
	public vehicle(String name, String carName, int capacity, long value, long compulsoryTax) {
		
		this.name = name;
		this.carName = carName;
		this.capacity = capacity;
		this.value = value;
		this.compulsoryTax = compulsoryTax;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCarName() {
		return carName;
	}
	public void setCar_name(String carName) {
		this.carName = carName;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public long getValue() {
		return value;
	}
	public void setValue(long value) {
		this.value = value;
	}
	public long getCompulsoryTax() {
		return compulsoryTax;
	}
	public void setCompulsory_tax(long compulsoryTax) {
		this.compulsoryTax = compulsoryTax;
	}
	@Override
	public String toString() {
		return name +   carName +  + capacity +"\t"  + value + "\t"  + compulsoryTax;
	}


}



