package iinheritance.java08;

public interface Father {
	void adn();
	//using via constructor
	default void playSport() {
		System.out.println("Father playing football ...");
	}
	//using via interface e.g: Father.drinkAlcohol()
	static void drinkAlcohol(int qty) {
		System.out.println(qty > 2 ? "drunk" : "continue");
	}
}
