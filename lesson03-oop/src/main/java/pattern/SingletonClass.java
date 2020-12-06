package pattern;

public class SingletonClass {
	private static SingletonClass instance;
	private String value;

	public String getValue() {
		return value;
	}
	private SingletonClass() {
		
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static SingletonClass getInstance() {
	if(instance ==null) {
		instance = new SingletonClass();
	}
	return instance;
	}
}
