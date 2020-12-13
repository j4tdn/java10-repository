package iinheritance.java08;

public interface Father {
	void adn();

	default void playSport() {
		System.out.println("Father playing football");
	}

	static void drinkALcohol(int qty) {
		System.out.println(qty > 2 ? "drunk" : "continue");
	}
}
