package bataille;

public interface Narrateur {
	
	public void afficherDecor();
	
	public void afficherVainqueur(int nbVictoireGauloise, int nbVictoireRomaine);
	
	default void afficherDebutLivre() {
		System.out.println("Nous sommes en 50 avant Jésus-Christ.");
		System.out.println("Toute la Gaule est occupée par les Romains...");
		System.out.println("Toute ? Non ! Un village peuplé d'irréductibles Gaulois résiste encore et toujours à l'envahisseur.");
		}
	
	default void afficherTitre() {
		System.out.println("Le dernier Combat");
	}
	
}
