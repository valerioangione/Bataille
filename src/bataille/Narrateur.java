package bataille;

public interface Narrateur {
	
	public void afficherDecor();
	
	public void afficherVainqueur(int nbVictoireGauloise, int nbVictoireRomaine);
	
	default void afficherDebutLivre() {
		System.out.println("Nous sommes en 50 avant J�sus-Christ.");
		System.out.println("Toute la Gaule est occup�e par les Romains...");
		System.out.println("Toute ? Non ! Un village peupl� d'irr�ductibles Gaulois r�siste encore et toujours � l'envahisseur.");
		}
	
	default void afficherTitre() {
		System.out.println("Le dernier Combat");
	}
	
}
