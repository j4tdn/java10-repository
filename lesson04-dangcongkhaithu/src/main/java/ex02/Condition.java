package ex02;

@FunctionalInterface
public interface Condition {
	// strategy method
	boolean test(int input);
}