package iinheritance.java08;

public interface Mother {
	void adn();
	default void playSport() {
		System.out.println("Mother olaying vollyball ...");
	}
	static void drinkAlcohol(int qty) {
		System.out.println(qty>2?"drunk":"continue");
	}
}
