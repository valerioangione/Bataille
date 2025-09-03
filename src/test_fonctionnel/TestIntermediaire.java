package test_fonctionnel;

import Personnage.*;

public class TestIntermediaire {
	
	public static void main(String[] args) {
	
	Romain minus= new Romain("Minus",6);
//	System.out.println(Equipement.CASQUE);
//	System.out.println(Equipement.BOUCLIER);
	minus.sEquiper(Equipement.CASQUE);
//	minus.sEquiper(Equipement.CASQUE);
	minus.sEquiper(Equipement.BOUCLIER);
//	minus.sEquiper(Equipement.BOUCLIER);
	minus.recevoirCoup(15);
	Druide druide = new Druide(5,10);
	druide.preparerPotion();
	
	}

}
