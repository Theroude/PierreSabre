package personnages;

public class Ronin extends Humain{

	public Ronin(String nom, String boissonFav, int argent) {
		super(nom, boissonFav, argent);
	}
	
	public int attributH = 1;
	
	public void donner(Commercant beneficiaire) { 
		int don = (int) (getArgent() * 0.1);
		beneficiaire.recevoir(don);
		perdreArgent(don);
		System.out.println(getNom() + " prend ces " + don + " sous.");
	}

}
