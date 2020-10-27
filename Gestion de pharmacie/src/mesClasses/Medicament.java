package mesClasses;

import java.util.Scanner;

abstract public class Medicament {
	String nom;
	typeEnum type;
	ModeDePriseEnum ModeDePrise; 
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
	
	public  void ajouterMedicament() {
		System.out.print("- Donner le nom du medicament :");
		try (Scanner scan = new Scanner (System.in)) {
			this.nom = scan.nextLine();
		}
		
		System.out.print("- Donner la quantite du medicament :");
		try (Scanner scan = new Scanner (System.in)) {
			this.quantite = scan.nextInt();
		}
		
		System.out.print("- Donner le numero de lot de ce stock :");
		try (Scanner scan = new Scanner (System.in)) {
			this.numeroDeLot = scan.nextInt();
		}
		
		System.out.print("- Le medicament va expirer apres combien de mois ?  :");
		try (Scanner scan = new Scanner (System.in)) {
			this.quantite = scan.nextInt();
		}
		
		System.out.print("- Le prix du medicament par boite (da/1boite) :");
		try (Scanner scan = new Scanner (System.in)) {
			this.prixParLot = scan.nextInt();
		}
		
		// definir le type du medicament 
		
		System.out.print("- Donner le type du medicament :\n");
		System.out.println("1- ANTIBIOTIQUES.");
		System.out.println("2- ANTIHISTAMINIQUES.");
		System.out.println("3- ANALGESIQUES.");
		System.out.println("4- Autre type.");
		System.out.print("\nVotre chiffre :  ");

		try (Scanner scan = new Scanner (System.in)) {
			int choixType = scan.nextInt();
			
			switch (choixType) {

			case 1 : 
				this.type = typeEnum.ANTIBIOTIQUES;
				break;
			case 2 : 
				this.type = typeEnum.ANTIHISTAMINIQUES;
				break;
			case 3 : 
				this.type = typeEnum.ANALGESIQUES;
				break;
			case 4 : 
				this.type = typeEnum.Autre_Type;
				break;
			default:
				System.out.println("\n\t\t\t\t Vous avez entré un nombre erroné :( ");
				System.out.println("\t\t\t\t !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n ");
				break;
			}
		}
		
		// definir le mode de prise  du medicament 
		
		System.out.print("- Donner le mode de prise  du medicament :\n");
		System.out.println("1- APPLICATION_CUTANEE.");
		System.out.println("2- INJECTABLE.");
		System.out.println("3- NASALE.");
		System.out.println("4- ORALE.");
		System.out.println("5- Autre mode de prise.");
		
		System.out.print("\nVotre chiffre :  ");

		try (Scanner scan = new Scanner (System.in)) {
			int choixType = scan.nextInt();
			
			switch (choixType) {

			case 1 : 
				this.ModeDePrise = ModeDePriseEnum.APPLICATION_CUTANEE;
				break;
			case 2 : 
				this.ModeDePrise = ModeDePriseEnum.INJECTABLE;
				break;
			case 3 : 
				this.ModeDePrise =ModeDePriseEnum.NASALE;
				break;
			case 4 : 
				this.ModeDePrise = ModeDePriseEnum.ORALE;
				break;
			case 5 : 
				this.ModeDePrise =ModeDePriseEnum.Autre_Mode;
				break;
			default:
				System.out.println("\n\t\t\t\t Vous avez entré un nombre erroné :( ");
				System.out.println("\t\t\t\t !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n ");
				break;
			}
		}

		
	}
}
