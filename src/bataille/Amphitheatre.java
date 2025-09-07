package bataille;

public class Amphitheatre implements Narrateur{
	
	@Override
	
	public void afficherDecor() {
		System.out.println("Dans un amphith��tre pr�s de Rome des combattants vont s'affronter");
	}
	
	@Override
	
	public void afficherVainqueur(int nbVictoireGauloise, int nbVictoireRomaine) {
		if (nbVictoireGauloise>nbVictoireRomaine) {
			System.out.println("Les Gaulois " +
					"vont pouvoir rentrer chez eux alors que C�sar est afflig� par " +
					"l'incomp�tence de ses soldats");
		} else {
			System.out.println("C�sar se l�ve et applaudit ses valeureux soldats");
		}
	}
	
	@Override
	
	public void afficherDebutLivre() {
		 System.out.println(
		 "Nous sommes en 50 avant J�sus-Christ.");
		 System.out.println("C�sar a pris en otage Id�fix et la seule fa�on "+
		 "pour eux de rentrer tous ensemble est de se battre dans l'ar�ne "+
		 "de l'amphith��tre de Rome.");
		 } 


}
