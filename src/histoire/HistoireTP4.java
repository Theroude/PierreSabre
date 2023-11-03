package histoire;

import personnages.*;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 50);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		Yakuza leNoir = new Yakuza("Le Noir", "whisky", 30);
		leNoir.direBonjour();
		leNoir.extorquer(marco);
	}

}
