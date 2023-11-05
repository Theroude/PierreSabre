package histoire;

import personnages.*;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 50);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		System.out.println();
		Yakuza leNoir = new Yakuza("Le Noir", "whisky", 30);
		leNoir.direBonjour();
		leNoir.extorquer(marco);
		System.out.println();
		Ronin roro = new Ronin("Roro", "shochu", 60);
		roro.direBonjour();
		roro.donner(marco);
	}

}
