package test_fonctionnel;

import Personnage.*;

public class Test {
	
	public static void main(String[] args) {
	
		Druide druide = new Druide(5,10);
		druide.parler("Je vais aller pr�parer une petite potion... ");
		druide.preparerPotion();
		Gaulois obelix = new Gaulois("Ob�lix", 100);
		druide.booster(obelix);
		Gaulois asterix= new Gaulois("Ast�rix",8);
		asterix.parler("Bonjour � tous");
		druide.booster(asterix);
		Romain minus= new Romain("Minus",6);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.parler("UN GAU... UN GAUGAU...");
		for (int i=0; i<2;i++) {
//			minus.recevoirCoup(3);
			asterix.frapper(minus);
		}
	}
}