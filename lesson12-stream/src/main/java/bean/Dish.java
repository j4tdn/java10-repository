package bean;

public class Dish {
	private String id;
	private String name;
	private double calories;
	private boolean vegetarian;

	public Dish() {
	}

	public Dish(String id, String name, double calories, boolean vegetarian) {
		this.id = id;
		this.name = name;
		this.calories = calories;
		this.vegetarian = vegetarian;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCalories() {
		return calories;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	@Override
	public String toString() {
		return name;
	}

}
