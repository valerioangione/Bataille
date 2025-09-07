package bataille;

public class Foret implements Presentateur{
	
	@Override
	
	public void afficherDecor() {
		System.out.println("Dans une sombre for�t en Armoricae une bagarre va �clater.");
	}
	
	@Override
	
	public void afficherVainqueur(int nbVictoireGauloise, int nbVictoireRomaine) {
		if (nbVictoireGauloise>nbVictoireRomaine) {
			System.out.println("Les Gaulois vont pouvoir c�l�brer leur victoire autour d'un banquet");
		} else {
			System.out.println("C�sar sera fier en apprenant que les Romains ont remport� la bataille");
		}
	}
	
	

}
