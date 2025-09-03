package test_fonctionnel;

import Personnage.*;

public class Test {
	
	public static void main(String[] args) {
	
		Druide druide = new Druide(5,10);
		druide.parler("Je vais aller préparer une petite potion... ");
		druide.preparerPotion();
		Gaulois obelix = new Gaulois("Obélix", 100);
		druide.booster(obelix);
		Gaulois asterix= new Gaulois("Astérix",8);
		asterix.parler("Bonjour à tous");
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