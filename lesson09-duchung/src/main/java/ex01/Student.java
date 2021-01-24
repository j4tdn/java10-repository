package ex01;

public class Student {
		private String Number;
		private String Name;
		private Enum XL;
		public Student() {
		}
		
		public String getNumber() {
			return Number;
		}
		public void setNumber(String number) {
			Number = number;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public Enum getXL() {
			return XL;
		}
		public void setXL(Enum xL) {
			XL = xL;
		}
		public Student(String number, String name, Enum xL) {
			super();
			Number = number;
			Name = name;
			XL = xL;
		}
		@Override
		public String toString() {
			return "Student [Number=" + Number + ", Name=" + Name + ", Category=" + XL + "]";
		}
		
		
}
