package mesClasses;

import java.util.Scanner;

public class ProduitParapharmaceutique {
	
	String nomDeProduit;
	int quantite;
	
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	int numeroDeLot;
	int dateDExpiration;
	int prixParLot;
	
	public void ajouterProuduitParapharmaceutique() {
		
		System.out.print("- Donner le nom du produit parapharmaceutique :");
		try (Scanner scan = new Scanner (System.in)) {
			this.nomDeProduit = scan.nextLine();
		}
		
		System.out.print("- Donner la quantite du produit parapharmaceutique :");
		try (Scanner scan = new Scanner (System.in)) {
			this.quantite = scan.nextInt();
		}
		
		System.out.print("- Donner le numero de lot de ce stock :");
		try (Scanner scan = new Scanner (System.in)) {
			this.numeroDeLot = scan.nextInt();
		}
		
		System.out.print("- Le produit parapharmaceutique va expirer apres combien de mois ?  :");
		try (Scanner scan = new Scanner (System.in)) {
			this.quantite = scan.nextInt();
		}
		
		System.out.print("- Le prix du produit parapharmaceutique par boite (da/1boite) :");
		try (Scanner scan = new Scanner (System.in)) {
			this.prixParLot = scan.nextInt();
		}

		
	}
	
}
