package histoire;

import personnages.Gaulois;
import villagegaulois.Etal;
import villagegaulois.Village;

public class ScenarioCasDegrade {
	
	public static void main(String[] args) {
		Gaulois obelix = new Gaulois("Obélix", 25);
		Gaulois bonemine = new Gaulois("Bonemine", 7);
		Village village = new Village("le village des irréductibles", 10, 5);
		village.ajouterHabitant(bonemine);
		village.ajouterHabitant(obelix);
		village.installerVendeur(bonemine, "fleurs", 20);
		Etal etal = new Etal();
		try {
			etal.acheterProduit(10, obelix);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Fin du test");
		}
	}
}
