package personnages;

public class Yakuza extends Humain {

	public Yakuza(String nom, String boissonFav, int argent) {
		super(nom, boissonFav, argent);
	}

	public String clan;
	private int reputation = 0;

	public void setClan(String clan) {
		this.clan = clan;
	}

	public void setReputation(int reputation) {
		this.reputation = reputation;
	}

	public int getReputation() {
		return reputation;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int argentVole = victime.seFaireExtorquer();
		gagnerArgent(argentVole);
		parler("J’ai piqué les " + argentVole + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent()
				+ " sous dans ma poche. Hi ! Hi !");
		reputation += 1;
	}

	public void perdre() {
		perdreArgent(getArgent());
		parler("J’ai perdu mon duel et mes " + getArgent() + " sous, snif... J'ai déshonoré le clan de " + clan + ".");
		reputation -= 1;
	}

	public void gagner(int gain) {
		gagnerArgent(gain);
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + "? Je l'ai dépouillé de ses "
				+ gain + " sous");
	}

}
