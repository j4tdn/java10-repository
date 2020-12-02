package bean;

public enum CirclePos {
	ONSIDE("On the circle"),
	  INSIDE("In circle"),
	  OUTSIDE( "Out of circle");
		public String value;
		 CirclePos(String initial) {
			value=initial;
		}
		 public String getValue() {
			 return value;
		 }
}
