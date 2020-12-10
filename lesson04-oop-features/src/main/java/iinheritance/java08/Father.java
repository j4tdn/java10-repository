package iinheritance.java08;


public interface Father {
	void adn();
	default void playSport() {
		System.out.println("Fater playing football ...");
	}
	static void drinlAlcohol(int qty) {
		System.out.println(qty > 2 ? "drunk" : "continue");
	}
}
