package test_fonctionnel;

import Personnage.*;
import bataille.Bataille;

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
		asterix.frapper(minus);
		minus.frapper(asterix);
		Gaulois obelix = new Gaulois("Obélix",100);
		Romain chorus = new Romain("Chorus", 6);
		Romain faitexcus = new Romain("Faitexcus", 6);
		Bataille bataille = new Bataille();
		bataille.ajouterGaulois(obelix);
		bataille.ajouterGaulois(asterix);
		bataille.ajouterRomain(minus);
		bataille.ajouterRomain(chorus);
		bataille.ajouterRomain(faitexcus);
		bataille.afficherEquipes();

		
	}
}
