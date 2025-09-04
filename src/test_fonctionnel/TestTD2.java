package test_fonctionnel;

import Personnage.*;

public class TestTD2 {
	
	public static void main(String[] args) {
		
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.parler("Bonjour");
		Romain minus = new Romain("Minus", 6);
		minus.parler("Bonjour");
		Gaulois asterix=new Gaulois("Astérix", 8);
		asterix.parler("Bonjour");
//		Personnage anonyme = new Personnage("Anonyme");
//		anonyme.parler("Bonjour");
		
	}

}
