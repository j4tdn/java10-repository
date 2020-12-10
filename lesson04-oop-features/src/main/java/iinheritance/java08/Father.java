package iinheritance.java08;

public interface Father {
	void adn();

	default void playSport() {
		System.out.println("Father playing footaball ...");
	}

	static void drinkAlcohol(int qty) {
		System.out.println(qty > 2 ? "drunk" : "continue");
	}

}
