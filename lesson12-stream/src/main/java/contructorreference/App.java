package contructorreference;

import java.util.function.Function;
import java.util.function.Supplier;

import bean.Apple;

public class App {
	public static void main(String[] args) {
		Supplier<Apple> sup = Apple::new;
		Apple a1 = sup.get();
		
		Function<String, Apple> func = Apple::new;
		Apple a2 = func.apply("red");
		
		System.out.println(a1);
		System.out.println(a2);
	}
}
