package bataille;


public interface Livre {
	default void afficherTitre() {
			System.out.println("Ast�rix");
	}
	default void afficherAuteur() {
			System.out.println("Promotion STRI L3");
	}
}