// import cartographieReseau.ReseauMap;
import clients.ordinateurs.OrdiFixe;
import clients.ordinateurs.OrdiPortable;
import clients.reseau.*;
import connexions.Cable;

public class TestPacket {

	public static void main(String[] args) {

		// -------------------------------------------------
		// Ajouter / Modifier / Supprimer des éléments
		OrdiPortable jacques = new OrdiPortable("192.168.1.1", "MAC DE JACQUES", "182.168.1.254","Ordi Portable de Jacques"); //on cr�e le PC de jacques
		OrdiFixe michelle = new OrdiFixe("192.168.1.2", "MAC DE MICHELLE", "182.168.1.254","Ordi Fixe de Michelle"); //on cr�e l'ordi de michelle
		OrdiPortable jean = new OrdiPortable("192.168.1.3", "MAC DE JEAN", "3", "Ordi Portable de Jean"); //on cr�e l'ordi de Jean

		Switch S1 = new Switch("Switch 1"); //on cr�e le switch

		Cable cable1 = new Cable(michelle, S1); //on branche le cable entre michelle et le switch
		Cable cable2 = new Cable(jacques, S1); //on branche le cable entre jacques et le switch
		Cable cable3 = new Cable(jean, jacques);

		System.out.println(S1.toString());
		System.out.println(cable1.printEnds()); // on affiche les connexions (ici michelle branch�e au switch)
		System.out.println(cable2.printEnds()); // on affiche les connexions (ici jacques branch� au switch)
	}

}
