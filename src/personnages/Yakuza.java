package personnages;

public class Yakuza extends Humain{

	public Yakuza(String nom, String boissonFav, int argent) {
		super(nom, boissonFav, argent);
	}
	
	private String clan;
	private int reputation = 0;
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int argentVole = victime.seFaireExtorquer();
		gagnerArgent(argentVole);
		parler("J’ai piqué les " + argentVole + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
		reputation += 1;
	}
	
}
