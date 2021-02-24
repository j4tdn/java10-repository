package exercises;

public class MinMax {
	private int max;
	private int min;

	public MinMax() {
	}
   
	public MinMax(int max, int min) {
		super();
		this.max = max;
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public int getMin() {
		return min;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public void setMin(int min) {
		this.min = min;
	}

	@Override
	public String toString() {
		return "max = " + max + ",  min = " + min;
	}

}
