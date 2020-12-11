package iinheritance.java08;

public interface Father {
	void adn();

	default void playSport() {
		System.out.println("Father playing footaball ...");
	}

	static void drinkAlcohl(int qty) {
		System.out.println(qty > 2 ? "drink" : "continue");
	}

}
