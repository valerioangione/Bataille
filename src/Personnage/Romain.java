package Personnage;

public class Romain {
	
	
	public Romain(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	private String nom;
	private int force;
	private Equipement[] equipement=new Equipement[2];
	private int nbEquipement;
	
	
	public String getNom() {
		return this.nom;
	}
	
	public void parler(String texte) {
		StringBuilder txt = new StringBuilder();
		txt.append("Le romain ").append(this.getNom()).append(": «")
		.append(texte).append("».");
		System.out.println(txt);
	}
	
	public void recevoirCoup(int coup) {
		for (Equipement equip : equipement) {
			if (equip==Equipement.CASQUE) {coup=coup-5;}
			if (equip==Equipement.BOUCLIER) {coup=coup-8;}
			if (coup<0) {coup=0;}
		}
		if (coup>=this.force) {this.force=0;
		this.parler("J'abandonne...");}
		else {this.force = this.force-coup;
		this.parler("Aïe !");}
	}
	
		
	public void sEquiper(Equipement equip) {
		StringBuilder txt=new StringBuilder();
		txt.append("Le soldat ").append(this.nom).append(" ");
		switch(nbEquipement) {
		case 0:
			ssEquiper(equip, txt);
			break;
		case 1:
			if (equipement[0]==equip) {txt.append("possède déjà un ")
				.append(equip.toString()).append(" !");}
			else {
				ssEquiper(equip, txt);
				}
			break;
		case 2:
			txt.append("est déjà bien protégé !");
			break;
			}
		System.out.println(txt);
	}

	private void ssEquiper(Equipement equip, StringBuilder txt) {
		equipement[nbEquipement]=equip;
		nbEquipement++;
		txt.append("s'équipe avec un ").append(equip.toString())
		.append(".");
	}

}
