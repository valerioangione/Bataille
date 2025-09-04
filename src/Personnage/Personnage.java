package Personnage;

public abstract class Personnage {
	
	public Personnage(String nom) {
		this.nom = nom;
	}
	
	private String nom;
	
	public String getNom() {
		return this.nom;
	}
	
	public String prendreParole() {
		return " " + this.getNom()+" : ";
	}
	
	public void parler(String texte) {
		StringBuilder txt = new StringBuilder();
		txt.append(this.prendreParole()).append("« ").append(texte)
		.append(" ».");
		System.out.println(txt.toString());
	}
}
