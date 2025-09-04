package Personnage;


public class Gaulois extends Personnage{
	public Gaulois(String nom, int force) {
		super(nom);
		this.force=force;
	}

	private int force;
	private int effetPotion = 1;
	
	
//	public void parler(String texte) {
//		StringBuilder txt = new StringBuilder();
//		txt.append("Le gaulois ").append(this.getNom()).append(": «")
//		.append(texte).append("».");
//		System.out.println(txt);
//	}
	
	public void frapper(Romain romain) {
		StringBuilder txt = new StringBuilder();
		txt.append(this.getNom())
		.append(" envoie un grand coup dans la mâchoire de ").append(romain.getNom());
		System.out.println(txt);
		romain.recevoirCoup((this.force/3)*this.effetPotion);
		if (this.effetPotion>1) {this.effetPotion--;}
	}
	
	
	public void boirePotion(int forcePotion) {
		this.effetPotion=forcePotion;
		this.parler("Merci Druide, je suis que ma force est " + effetPotion + " fois décuplée.");
	}
	
	@Override
	
	public String prendreParole() {
		return "Le gaulois"+super.prendreParole();
	}

}