package Personnage;


public class Gaulois extends Combattant{
	public Gaulois(String nom, int force) {
		super(nom, force);
	}

	private int effetPotion = 1;
	
	
//	public void parler(String texte) {
//		StringBuilder txt = new StringBuilder();
//		txt.append("Le gaulois ").append(this.getNom()).append(": «")
//		.append(texte).append("».");
//		System.out.println(txt);
//	}
	
	
	public void boirePotion(int forcePotion) {
		this.effetPotion=forcePotion;
		this.parler("Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée.");
		System.out.println("aaaaaaa test");
	}
	
	@Override
	
	public String prendreParole() {
		return "Le gaulois"+super.prendreParole();
	}
	
	@Override
	
	public void frapper(Combattant romain) {
		StringBuilder txt = new StringBuilder();
		txt.append(this.getNom())
		.append(" envoie un grand coup dans la mâchoire de ").append(romain.getNom());
		System.out.println(txt);
		romain.recevoirCoup((this.getForce()/3)*this.effetPotion);
		if (this.effetPotion>1) {this.effetPotion--;}
	}

}