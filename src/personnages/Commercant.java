package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}

	public int seFaireExtorquer() {
		int argentVole = getArgent();
		parler("J’ai tout perdu! Le monde est trop injuste...");
		perdreArgent(getArgent());
		return argentVole;
	}

	public void recevoir(int argent) {
		parler(argent + " sous ! Je te remercie généreux donateur!");
		gagnerArgent(argent);
	}
}
