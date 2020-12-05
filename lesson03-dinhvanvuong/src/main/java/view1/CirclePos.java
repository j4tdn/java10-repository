package view1;



public enum CirclePos {
	ONSIDE ("On the circle "),
	INSIDE (" In circle "),
	OUTSIDE ("Out of circle");
	
	public String value;

	private CirclePos(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	}
	
	
	
	


