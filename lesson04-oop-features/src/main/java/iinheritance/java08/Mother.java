package iinheritance.java08;

public interface Mother {
	void adn();
	default void playSport() {
		System.out.println("Mother playing football ...");
	}
	static void drinlAlcohol(int qty) {
		System.out.println(qty > 2 ? "drunk" : "continue");
	}
}
