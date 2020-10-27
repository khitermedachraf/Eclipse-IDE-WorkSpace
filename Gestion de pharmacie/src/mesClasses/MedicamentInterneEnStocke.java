package mesClasses;

import java.util.Scanner;

public class MedicamentInterneEnStocke extends Medicament {
	
	String[] compositions = new String[6];
	final int PourcentageRemise = 20; 
	
	// definir la methode pour ajouter les compositions du medicament
	public void ajouterMedInterne() {
	
		System.out.println("-Lister les compositions de ce medicament : ");
		int i = 1; 
		String character;
		do {
			try (Scanner scan = new Scanner (System.in)) {
				this.compositions[i] = scan.nextLine();
			}
			System.out.println(".Ajouter un autre composant ? (o/n) : ");
			try (Scanner scan = new Scanner (System.in)) {
				character = scan.nextLine() ;
			}
			i++;

		} while ((i <= compositions.length) && (character == "o" || character == "O"));
	}
	
}
