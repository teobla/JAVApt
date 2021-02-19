// import cartographieReseau.ReseauMap;
import clients.ordinateurs.OrdiFixe;
import clients.ordinateurs.OrdiPortable;
import clients.reseau.*;
import connexions.Cable;

public class TestPacket {

	public static void main(String[] args) {

		// -------------------------------------------------
		// Ajouter / Modifier / Supprimer des Ã©lÃ©ments
		OrdiPortable jacques = new OrdiPortable("192.168.1.1", "MAC DE JACQUES", "182.168.1.254","Ordi Portable de Jacques"); //on crée le PC de jacques
		OrdiFixe michelle = new OrdiFixe("192.168.1.2", "MAC DE MICHELLE", "182.168.1.254","Ordi Fixe de Michelle"); //on crée l'ordi de michelle
		OrdiPortable jean = new OrdiPortable("192.168.1.3", "MAC DE JEAN", "3", "Ordi Portable de Jean"); //on crée l'ordi de Jean

		Switch S1 = new Switch("Switch 1"); //on crée le switch

		Cable cable1 = new Cable(michelle, S1); //on branche le cable entre michelle et le switch
		Cable cable2 = new Cable(jacques, S1); //on branche le cable entre jacques et le switch
		Cable cable3 = new Cable(jean, jacques);

		System.out.println(S1.toString());
		System.out.println(cable1.printEnds()); // on affiche les connexions (ici michelle branchée au switch)
		System.out.println(cable2.printEnds()); // on affiche les connexions (ici jacques branché au switch)
	}

}
