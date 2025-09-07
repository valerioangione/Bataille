package Personnage;

public abstract class Combattant extends Personnage{
	
	public Combattant(String nom, int force) {
		super(nom);
		this.force = force;
	}
	
	private int force;
	
	public void recevoirCoup(int coup) {
		if (coup>=this.force) {this.force=0;
		this.parler("J'abandonne...");}
		else {this.force = this.force-coup;
		this.parler("Aïe !");}
	}
	
	public int getForce() {
		return this.force;
	}
	
	public boolean isKO() {
		return force <= 0;
	}
	
	public abstract void frapper(Combattant combattant);
}
