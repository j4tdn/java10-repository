package iinheritance.java08;

public interface Mother {
void adn();
	
	default void playSport() {
	}
	static void drinkAncohol(int qty) {
		System.out.println(qty> 2 ? "drunk ": "continue");
	}


}
