package personnages;

public class Ronin extends Humain {

	public Ronin(String nom, String boissonFav, int argent) {
		super(nom, boissonFav, argent);
	}

	private int attributH = 1;

	public void donner(Commercant beneficiaire) {
		int don = (int) (getArgent() * 0.1);
		beneficiaire.recevoir(don);
		perdreArgent(don);
		parler(getNom() + " prend ces " + don + " sous.");
	}

	public void provoquer(Yakuza adversaire) {
		int force = attributH * 2;
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre " + "marchand!");
		if (force >= adversaire.getReputation()) {
			parler("Je t’ai eu petit yakusa!");
			gagnerArgent(adversaire.getArgent());
			adversaire.perdre();
			attributH += 1;
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(getArgent());
			perdreArgent(getArgent());
			attributH -= 1;
		}
	}

}
