package view;
 
abstract class People{
	protected String name;
	protected int birth;
	public double salary;
	protected double position;
	public People(String name, int birth, double salary, double position) {
		super();
		this.name = name;
		this.birth = birth;
		this.salary = salary;
		this.position = position;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
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
		return "People [name=" + name + ", birth=" + birth + ", salary=" + salary + ", position=" + position + "]";
	}
	
	
}