package Personnage;

import java.util.Random;

public class Druide extends Personnage{
	public Druide(String nom, int min, int max) {
		super(nom);
		this.FORCE_POTION_MIN=min;
		this.FORCE_POTION_MAX=max;
	}
	
	private final int FORCE_POTION_MIN;
	private final int FORCE_POTION_MAX;
	private int forcePotion=0;
	
//	public void parler(String texte) {
//		StringBuilder txt = new StringBuilder();
//		txt.append("Le druide : �").append(texte).append("�.");
//		System.out.println(txt);
//	}
	
	public void preparerPotion() {
		Random random = new Random();
		while (forcePotion <FORCE_POTION_MIN) {
			forcePotion = random.nextInt(FORCE_POTION_MAX+1);
		}
		if (forcePotion>7) {this.parler("J'ai pr�par� une super potion de force " + forcePotion);}
		else {this.parler("Je n'ai pas trouv� tous les ingr�dients ma potion est seulement de force "+ forcePotion);}	
	}
	
	public void booster(Gaulois gaulois) {
		if (gaulois.getNom()== "Ob�lix") {
			this.parler("Non, Ob�lix !... Tu n'auras pas de potion magique !");
			gaulois.parler("Par B�l�nos, ce n'est pas juste !");
		}
		else {gaulois.boirePotion(forcePotion);}
	}
	
	@Override
	
	public String prendreParole() {
		return "Le druide"+super.prendreParole();
	}
}
