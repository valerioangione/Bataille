package bataille;

public interface Presentateur extends Narrateur, Livre{
	
	default void afficherTitre() {
		Livre.super.afficherTitre();
		Narrateur.super.afficherTitre();
	}

}
