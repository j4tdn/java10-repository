package exercise02;

@FunctionalInterface
public interface UserCondition {
	//strategy method
	boolean test (char input);
}
