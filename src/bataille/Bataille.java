package bataille;

import Personnage.*;

public class Bataille {
	
	
	private Romain[] equipeRomaine = new Romain[3];
	private Gaulois[] equipeGauloise = new Gaulois[3];
	private int nbRomain=0;
	private int nbGaulois=0;
	
	public void ajouterRomain(Romain romain) {
		if (nbRomain<3) {
			equipeRomaine[nbRomain]=romain;
			this.nbRomain++;
		}
		else {new ArrayIndexOutOfBoundsException();}
	}
	
	public void ajouterGaulois(Gaulois gaulois) {
		if (nbGaulois<3) {
			equipeGauloise[nbGaulois]=gaulois;
			this.nbGaulois++;
		}
		else {new ArrayIndexOutOfBoundsException();}
	}
	
	public void afficherEquipes() {
		StringBuilder txtGaulois = new StringBuilder();
		txtGaulois.append("Les gaulois toujours prêts pour la baston sont : ")
		.append(afficherCombattants(equipeGauloise, nbGaulois));
		StringBuilder txtRomain = new StringBuilder();
		txtRomain.append("Les romains devant combattre sont : ")
		.append(afficherCombattants(equipeRomaine, nbRomain));
		System.out.println(txtGaulois.toString());
		System.out.println(txtRomain.toString());
	}
	
	private String afficherCombattants(Combattant[] equipe, int nbCombattant) {
		StringBuilder txt = new StringBuilder();
		for (int i=0; i<nbCombattant; i++) {
			if(i>0) {txt.append(", ");}
			txt.append(equipe[i].getNom());
		}
		txt.append(".");
		return txt.toString();
	}
	
}
