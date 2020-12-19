package ex04;

abstract class People{
	protected String name;
	protected int birthDay;
	public double salary;
	protected double position;
	public People(String name, int birthDay, double salary, double position) {
		super();
		this.name = name;
		this.birthDay = birthDay;
		this.salary = salary;
		this.position = position;
	}
	public void GiamDoc() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getPosition() {
		return position;
	}
	public void setPosition(double position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", birthDay=" + birthDay + ", salary=" + salary + ", position=" + position + "]";
	}
	
	
}