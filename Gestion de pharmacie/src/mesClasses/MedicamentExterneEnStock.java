package mesClasses;

import java.util.Scanner;

public class MedicamentExterneEnStock extends Medicament {

	String fournisseur; 
	final int PourcentageRemise = 10; 
	
	public void ajouterMedExterne() {
		System.out.print("Donner le nom complet du fournisseur : ");
		try (Scanner scan = new Scanner (System.in)) {
			this.fournisseur = scan.nextLine();
		}
	
	}
}