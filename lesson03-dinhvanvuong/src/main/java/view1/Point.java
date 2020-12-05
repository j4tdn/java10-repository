package view1;


public class Point {
		private int x;
		private int y;
		public Point() {
			
		}
		public void setX(int x) {
			this.x = x;
		}
		public void setY(int y) {
			this.y = y;
		}
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		@Override
		public String toString() {
			return "(" + x + ", " + y + ")";
		}
		private static double distance(Point O, Point A) {
			return Math.sqrt(Math.pow(A.x - O.x, 2) + Math.pow(A.y - O.y, 2));

		}
    
 
}
